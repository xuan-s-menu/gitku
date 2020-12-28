package servlet;


import service.cardservice;
import service.userservice;
import unit.card;
import unit.user;

import java.io.IOException;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@WebServlet("/register")
public class registerservlet extends HttpServlet{
    private static final long serialVersionUID = 1L;

    public registerservlet() {
        super();
    }
    /* 重写service方法 */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("执行注册验证");
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session=request.getSession();
        userservice userservice =new userservice();
        String id=request.getParameter("id");
        String password=request.getParameter("password");
        String Phone=request.getParameter("phone");
        int phone=Integer.valueOf(Phone);
        System.out.println("servlet获得名字为"+id);
        System.out.println("servlet获得邮箱为"+password);
        System.out.println("servlet获得电话为"+phone);
        cardservice cardservice=new cardservice();

        try {
            user user=new user(util.UUIDUtils.getId(),id,password,phone);
            userservice.adduser(user);
            session.setAttribute("user",user);
            List<card> cardList=cardservice.findcardbyuserid(id);
            session.setAttribute("cardlist",cardList);
            response.sendRedirect("index.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

