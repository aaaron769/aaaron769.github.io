import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AuthFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // we need to cast the to httpServle....
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response =(HttpServletResponse)servletResponse;
        //1. check the path
        String servletPath = request.getServletPath();
        //2. if it is login noProblem continue for further operation otherwise
        //check if the user is logeed in and otherwise send error message

        if(servletPath.equals("/login")){
            //she can pass
            filterChain.doFilter(request,response);
            return;
        }else {
            PrintWriter printWriter = response.getWriter();
            printWriter.print("<p>you need to login first<p>");
            request.getRequestDispatcher("login.jsp").include(request,response);
        }
        //        User user = (User)request.getSession().getAttribute("user");
//        if(user!=null){
//            filterChain.doFilter(request,response);
//        }


    }

    @Override
    public void destroy() {

    }
}
