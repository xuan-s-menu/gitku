package servlet;


import service.*;
import unit.*;

import java.io.IOException;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@WebServlet("/adminbeginanswer")
public class adminbeginanswerservlet extends HttpServlet{
    private static final long serialVersionUID = 1L;

    public adminbeginanswerservlet() {
        super();
    }
    /* 重写service方法 */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("执行登录验证");
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session=request.getSession();
        adminservice adminservice=new adminservice();
        String id=request.getParameter("id");
        System.out.println("servlet获得留言id为"+id);
        articeleservice articeleservice=new articeleservice();
        userservice userservice=new userservice();
        try {
                article article=articeleservice.findarticlebyid(id);
                user user=userservice.finduserbyId(article.getUserid());
                session.setAttribute("article",article);
                session.setAttribute("user",user);
                response.sendRedirect("adminanswer.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
