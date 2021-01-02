package servlet;


import service.*;
import unit.*;

import java.io.IOException;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@WebServlet("/adminanswer")
public class adminanswerservlet extends HttpServlet{
    private static final long serialVersionUID = 1L;

    public adminanswerservlet() {
        super();
    }
    /* 重写service方法 */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("执行留言验证");
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session=request.getSession();
        adminservice adminservice=new adminservice();
        String liuyan=request.getParameter("liuyan");
        System.out.println("servlet获得留言liuyan为"+liuyan);
        articeleservice articeleservice=new articeleservice();
        userservice userservice=new userservice();
        try {
            article article=(article)session.getAttribute("article");
            articeleservice.updatearticle(article.getArticleid(),liuyan);
           /* user user=userservice.finduserbyId(article.getUserid());*/
          /*  session.setAttribute("article",article);
            session.setAttribute("user",user);*/
            response.sendRedirect("adminindex.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
