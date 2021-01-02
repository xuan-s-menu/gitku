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

@WebServlet("/cardadd")
public class cardaddservlet extends HttpServlet{
    private static final long serialVersionUID = 1L;

    public cardaddservlet() {
        super();
    }
    /* 重写service方法 */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("执行添加卡片验证");
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session=request.getSession();
        userservice loginservice =new userservice();
        String id=request.getParameter("id");
        System.out.println("servlet获得卡的名字为"+id);
        cardservice cardservice=new cardservice();
        user user=(user)session.getAttribute("user");
        try {
            card card=new card(util.UUIDUtils.getId(),id,0.0,user.getUserid());
            cardservice.addcard(card);
            List<card> cardList=cardservice.findcardbyuserid(user.getUserid());
            for(card card1:cardList)
            {
                System.out.println("找到的卡片列表为"+card1.getCardname());
            }
            session.setAttribute("cardlist",cardList);
            response.sendRedirect("index.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
