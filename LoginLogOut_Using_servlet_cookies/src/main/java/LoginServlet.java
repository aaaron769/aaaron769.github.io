import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

// login
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");// contentType of our html
        PrintWriter out=response.getWriter();// we are initializing PrintWriter interface
// this will dispach to link.html and will come back because of include.
        RequestDispatcher requestDispatcher =request.getRequestDispatcher("resource/link.html");
        requestDispatcher.include(request, response);
// we are getting name and password from request
        String name=request.getParameter("name");
        String password=request.getParameter("password");
// we are comparing the password
        if(password.equals("admin123")){
            out.print("You are successfully logged in!");
            out.print("<br>Welcome, "+name);
// we are creating a cookie having string and object name ;
            Cookie ck=new Cookie("name",name);
            ck.setMaxAge(36000);
            response.addCookie(ck);
//            HttpSession session = request.getSession();
//            session.setAttribute("name",name);

        }else{
            // this will forward to login showing error message because of include
            out.print("sorry, username or password error!");
            request.getRequestDispatcher("resource/login.html").include(request, response);
        }

        out.close();
    }

}  
