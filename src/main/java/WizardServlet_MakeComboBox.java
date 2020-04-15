import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Map;
import java.util.TreeMap;

@WebServlet(name="MakeComboBox", urlPatterns="/makecombobox")
public class WizardServlet_MakeComboBox extends HttpServlet {

    private Map<String, String> goods=new TreeMap<>();
    @Override
    public void init() throws ServletException {
        super.init();
        goods.put("Alma","Alma");
        goods.put("Körte","Körte"); //Ha ezt választom ki, el fog szállni, feltételezhetőleg az "ö" betű miatt...
        goods.put("Őszibarack","Őszibarack");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String options = "";

        for (String aGood:goods.keySet()) {
            options += "<option value=\"" + aGood + "\">" + aGood + "</option>";
        }

        PrintWriter out = resp.getWriter();
        out.println(options);

    }
}
