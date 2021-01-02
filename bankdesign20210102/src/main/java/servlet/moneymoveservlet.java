package servlet;
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

@WebServlet("/moneymove")
public class moneymoveservlet extends HttpServlet{
    private static final long serialVersionUID = 1L;

    public moneymoveservlet() {
        super();
    }
    /* 重写service方法 */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("执行添加转入验证");
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session=request.getSession();
        userservice loginservice =new userservice();
        String id=request.getParameter("id");
        String id2=request.getParameter("id2");
        String Money=request.getParameter("money");
        double money=Double.valueOf(Money);
        System.out.println("servlet获得卡的名字为"+id);
        System.out.println("servlet获得卡的名字2为"+id2);
        System.out.println("servlet获得钱数为"+money);
        cardservice cardservice=new cardservice();
        msgservice msgservice=new msgservice();
        user user=(user)session.getAttribute("user");
        try {

            card card=cardservice.findcardbycardname(id);
            card card2=cardservice.findcardbycardname(id2);
            cardservice.moneymove(id,card.getCardmoney()-money);
            cardservice.moneyin(id2,card2.getCardmoney()+money);
            Date date=new Date();
            msg msg=new msg(card.getCardid(),card2.getCardid(),money,date,util.UUIDUtils.getId());
            msgservice.addmsg(msg);
            response.sendRedirect("index.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
