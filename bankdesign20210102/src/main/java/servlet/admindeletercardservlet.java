package servlet;

import service.*;
import unit.*;

import java.io.IOException;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@WebServlet("/deletecard")
public class admindeletercardservlet extends HttpServlet{
    private static final long serialVersionUID = 1L;

    public admindeletercardservlet() {
        super();
    }
    /* 重写service方法 */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("执行留言验证");
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session=request.getSession();
        adminservice adminservice=new adminservice();
        String id=request.getParameter("id");
        System.out.println("servlet获得id为"+id);
        articeleservice articeleservice=new articeleservice();
        userservice userservice=new userservice();
        cardservice cardservice=new cardservice();
        try {
            cardservice.deletecard(id);
            List<card> cardList=cardservice.findcardList();
            session.setAttribute("cardlist",cardList);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
