import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/login")
public class LoginController extends HttpServlet {
    UserDao userDao =new UserDao();
    int i;
    @Override
    public void init(ServletConfig config) throws ServletException {
         i =0;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uName = req.getParameter("userName");
        String pWord = req.getParameter("userPassword");
        String cBox = req.getParameter("userCheckBox");
        // create  a session
        HttpSession session = req.getSession();
        session.setAttribute("user_Name",uName);
        //
        // create user by the user
        User user = new User(uName,pWord);
        userDao.addUser(user);
        session.setAttribute("user",user);
        //user should store in a cookie
        Cookie cookie = new Cookie("user",uName);
        cookie.setMaxAge(125252);
        resp.addCookie(cookie);



        PrintWriter printWriter = resp.getWriter();
        printWriter.print("<a href='logOut'>pressHereLogOut</a>");
    }
}
