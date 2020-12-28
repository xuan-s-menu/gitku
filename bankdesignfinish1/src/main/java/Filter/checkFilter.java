package Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class checkFilter implements Filter {

    private String ip = "";
    @Override
    public void destroy() {
        System.out.println("释放资源");
    }

    @Override
    public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain chian)
            throws IOException, ServletException {
        System.out.println("执行过滤");
        HttpServletRequest req = (HttpServletRequest) arg0;
        HttpServletResponse res = (HttpServletResponse) arg1;
        String uri = req.getServletPath();
        String uri2=uri.substring(1,6);
        String uri3=uri.substring(uri.length()-3,uri.length());
        System.out.println("过滤器：路径为"+uri);
        System.out.println("过滤器：前缀为"+uri2);
        System.out.println("过滤器：后缀为"+uri3);

            HttpSession session=req.getSession();
            if(uri3.equals("jsp")) {
                if ((session.getAttribute("user") == null) && (session.getAttribute("admin") == null)) {
                    System.out.println("匹配到路径"+uri+"要拦截");
                    if (uri2.equals("admin")) {
                        req.getRequestDispatcher("adminlogin.jsp").forward(req, res);
                    } else {
                        req.getRequestDispatcher("login.jsp").forward(req, res);
                    }
                    return;
                } else {
                    chian.doFilter(arg0, arg1);
                }
            }
            else
            {
                chian.doFilter(arg0, arg1);
            }
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {

        System.out.println("初始化");
        ip = arg0.getInitParameter("ip");
    }

}
