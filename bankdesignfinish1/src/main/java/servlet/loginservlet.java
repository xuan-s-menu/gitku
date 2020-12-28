package servlet;

import service.articeleservice;
import service.cardservice;
import service.userservice;
import unit.article;
import unit.card;
import unit.user;

import java.io.IOException;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@WebServlet("/login")
public class loginservlet extends HttpServlet{
    private static final long serialVersionUID = 1L;

    public loginservlet() {
        super();
    }
    /* 重写service方法 */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("执行登录验证");
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session=request.getSession();
        userservice userservice =new userservice();
        String id=request.getParameter("id");
        String password=request.getParameter("password");
        System.out.println("servlet获得密码为"+id);
        System.out.println("servlet获得邮箱为"+password);
        cardservice cardservice=new cardservice();
        articeleservice articleservice=new articeleservice();
        try {
            user user=userservice.finduserbyId(id);
            if(user.getUserpassword().equals(password))//密码正确
            {
                List<card> cardList=cardservice.findcardbyuserid(user.getUserid());
               /* System.out.println("找到的卡片为");
                for(card card1:cardList)
                {
                    System.out.println("找到的卡片列表为"+card1.getCardname());
                }*/
               List<article> articleList=articleservice.findarticlebyuserid(user.getUserid());
                session.setAttribute("cardlist",cardList);
                session.setAttribute("articlelist",articleList);
                session.setAttribute("user",user);
                response.sendRedirect("index.jsp");
            }
            else
            {
                //密码错误
                boolean loginsuccess=false;
                session.setAttribute("loginsuccess",loginsuccess);
                response.sendRedirect("login.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
