import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.io.PrintWriter;

@WebServlet( name = "SelectGood", urlPatterns="/selectgood")
public class WizardServlet_SelectGood extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //System.out.println("GET");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session=req.getSession();
        session.setAttribute("cbGoods", req.getParameter("cbGoods"));

        resp.sendRedirect("./wizard_step_2.html");
    }

    @Override
    public void init() throws ServletException {
        super.init();
        //session.getAttribute(...), .setAttribute(...), stb.
    }
}
