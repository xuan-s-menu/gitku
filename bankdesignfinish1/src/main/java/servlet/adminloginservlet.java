package servlet;


import service.*;
import unit.*;

import java.io.IOException;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@WebServlet("/adminlogin")
public class adminloginservlet extends HttpServlet{
    private static final long serialVersionUID = 1L;

    public adminloginservlet() {
        super();
    }
    /* 重写service方法 */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("执行登录验证");
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session=request.getSession();
        userservice userservice =new userservice();
        adminservice adminservice=new adminservice();
        String id=request.getParameter("id");
        String password=request.getParameter("password");
        System.out.println("servlet获得管理员为"+id);
        System.out.println("servlet获得密码为"+password);
        cardservice cardservice=new cardservice();
        msgservice msgservice=new msgservice();
        articeleservice articeleservice=new articeleservice();
        try {
            /*user user=userservice.finduserbyId(id);*/
            admin admin=adminservice.findadminbyId(id);
            if(admin.getAdminpassword().equals(password))//密码正确
            {
                List<card> cardList=cardservice.findcardList();
                List<user> userList=userservice.finduserList();
                List<msg> msgList=msgservice.findmsgList();
                List<article> articleList=articeleservice .findarticleListbyadminid(id);
               /* System.out.println("找到的卡片为");
                for(card card1:cardList)
                {
                    System.out.println("找到的卡片列表为"+card1.getCardname());
                }*/
                session.setAttribute("cardlist",cardList);
                session.setAttribute("userlist",userList);
                session.setAttribute("msglist",msgList);
                session.setAttribute("articleList",articleList);
                session.setAttribute("admin",admin);
                response.sendRedirect("adminindex.jsp");
            }
            else
            {
                //密码错误
                boolean adminlogin=false;
                session.setAttribute("adminlogin",adminlogin);
                response.sendRedirect("adminlogin.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
