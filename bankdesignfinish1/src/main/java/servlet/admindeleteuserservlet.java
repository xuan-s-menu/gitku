package servlet;


import service.*;
import unit.*;

import java.io.IOException;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@WebServlet("/deleteuser")
public class admindeleteuserservlet extends HttpServlet{
    private static final long serialVersionUID = 1L;

    public admindeleteuserservlet() {
        super();
    }
    /* 重写service方法 */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("执行删除用户验证");
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session=request.getSession();
        adminservice adminservice=new adminservice();
        String id=request.getParameter("id");
        System.out.println("servlet获得id为"+id);
        articeleservice articeleservice=new articeleservice();
        userservice userservice=new userservice();
        try {
            userservice.deleteuser(id);
            List<user> userList=userservice.finduserList();
            session.setAttribute("userlist",userList);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
