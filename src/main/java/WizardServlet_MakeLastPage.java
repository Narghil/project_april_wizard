import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet( name = "MakeLastPage", urlPatterns="/makelastpage")
public class WizardServlet_MakeLastPage extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html><html lang=hu><head><meta charset=UTF-8><title>Rendelés összesítése</title></head>");
        out.println("<body><h1>Rendelésed:</h1>");
        out.println("Session ID:" + session.getId() + "<br>");
        out.println("Rendelt termék:" + session.getAttribute("cbGoods") + "<br>");
        out.println("Neved:" + req.getParameter("tfName") + "<br>");
        out.println("Címed:" + req.getParameter("tfAddress") + "<br>");
        out.println("<a href=\"index.html\" target=\"_self\">Rendben, fizetek!</a>");
        out.println("</body></html>");
    }

}
