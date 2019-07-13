import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
//    int i =0;
//    @Override
//    public void init(){
//        System.out.println();
//        System.out.println("the value of i is\n\n"+i);
//    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // I will create my first response page and container will respond to browser.
        // the printWriter interface will get object from resp.getWriter(); and provide me a page to write on it.
        PrintWriter out = resp.getWriter();
        out.println("hello world!");

    }
}
