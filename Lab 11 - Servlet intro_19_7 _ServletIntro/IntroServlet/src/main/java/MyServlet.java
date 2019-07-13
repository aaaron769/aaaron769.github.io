import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;


public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        out.print("<html><head><title>Test</title></head><body>");
        out.print("<form method='post'>");
        out.print("Name: <input type = 'text' name ='userName'/><br/>");
        out.print("Email: <input type = 'email' name ='userEmail'/> <br/>");
        out.print("Problem: <input type = 'text' name ='problem'/> <br/>");
        out.print("ProblemDescription: <textArea name ='problemDescription'></textArea> <br/>");
        out.print("<input type = 'submit' value ='submit'/>");
        out.print("</form>");
        out.print("</body></html>");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");
        String userEmail = req.getParameter("userEmail");
        ServletContext sc = this.getServletContext();
        String support_email = sc.getInitParameter("myEmail");
        Random r = new Random(1000000);
        int support_ticket_id = r.nextInt();
        PrintWriter out = resp.getWriter();

        out.println(" Thank you!["+ userName+"] for contacting us.");
        out.println("We should receive reply from us with in 24 hrs in your email address ["
        +userEmail+".\nLet us know in our support email ["+support_email+"] " +
                "if you don’t receive reply within 24 hrs. " +
                "\nPlease be sure to attach your reference ["+support_ticket_id+"] in your email. ");


    }
}
