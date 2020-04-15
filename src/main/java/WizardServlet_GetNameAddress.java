import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
//import java.io.PrintWriter;

@WebServlet( name = "GetNameAddress", urlPatterns="/getnameaddress")
public class WizardServlet_GetNameAddress extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("GET");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session=req.getSession();

        RequestDispatcher rd = req.getRequestDispatcher("/makelastpage");
        rd.include(req, resp);

        session.invalidate();
    }

    @Override
    public void init() throws ServletException {
        super.init();
        //session.getAttribute(...), .setAttribute(...), stb.
    }
}

