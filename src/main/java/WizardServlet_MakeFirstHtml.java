import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@WebServlet(name="MakeFirstHtml", urlPatterns="/makefirsthtml")
public class WizardServlet_MakeFirstHtml extends HttpServlet {

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            //Ez de csúf... :(
            String html1 = "<!DOCTYPE html>" +
                           "<html lang=\"hu\">" +
                           "<head>" +
                           "     <meta charset=\"UTF-8\">" +
                           "     <title>Első lépés</title>" +
                           "</head>" +
                           "<body>" +
                           "<h1>Első lépés</h1>" +
                           "<h2>Válassz egy terméket!</h2>" +
                           "<form id=\"stepOneForm\" action=\"/april-wizard/selectgood\" method=\"post\">" +
                           "     <label for=\"cbGoods\">Válassz egy terméket:</label>" +
                           "     <select id=\"cbGoods\" name=\"cbGoods\">"
            ;
            String html2 = "    </select>" +
                           "    <br />" +
                           "    <a href=\"#\" onclick=\"document.getElementById('stepOneForm').submit();\">Tovább</a>" +
                           "</form>" +
                           "</body>" +
                           "</html>"
            ;

            PrintWriter out = resp.getWriter();
            resp.setContentType("text/html; charset=UTF-8");

            out.println(html1);
            req.getRequestDispatcher("/makecombobox").include(req, resp);
            out.println(html2);
            out.close();

        }
    }


