package servlet;
import service.articeleservice;
import service.cardservice;
import service.msgservice;
import service.userservice;
import unit.card;
import unit.msg;
import unit.user;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@WebServlet("/liuyan")
public class liuyanservlet extends HttpServlet{
    private static final long serialVersionUID = 1L;

    public liuyanservlet() {
        super();
    }
    /* 重写service方法 */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("执行添加留言验证");
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session=request.getSession();
        userservice loginservice =new userservice();
        String name=request.getParameter("name");
        String liuyan=request.getParameter("liuyan");
        System.out.println("servlet获得管理员名字为"+name);
        System.out.println("servlet获得留言为"+liuyan);
        articeleservice articeleservice=new articeleservice();
        user user=(user)session.getAttribute("user");
        try {
            articeleservice.addarticle(user.getUserid(),name,liuyan,"",util.UUIDUtils.getId());
            response.sendRedirect("index.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}