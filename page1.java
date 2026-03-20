package URLRewritting;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class page1 extends HttpServlet{
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String nav = req.getParameter("nav");
        nav = nav + ",page1";

        out.println("<h2>Page 1</h2>");
        out.println("Navigation: " + nav + "<br>");
        out.println("<a href='page2?nav=" + nav + "'>Go to Page2</a>");
    }
}
