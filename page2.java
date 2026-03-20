package URLRewritting;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class page2 extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String nav = req.getParameter("nav");
        nav = nav + ",page2";

        out.println("<h2>Page 2</h2>");
        out.println("Navigation: " + nav + "<br>");
        out.println("<a href='home?nav=" + nav + "'>Go to home</a>");
    }
}
