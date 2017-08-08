package cdk.com.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "MatchDetailServlet")
public class MatchDetailServlet extends HttpServlet {
    List<Match> match = new ArrayList<>();

    public void init() {
        match.add(new Match("India", "England", "T20", 230, 200, "India"));
        match.add(new Match("India", "England", "ONEDAY", 200, 220, "England"));
        match.add(new Match("India", "England", "50-50", 230, 200, "India"));
        match.add(new Match("India", "England", "Worldcup", 330, 300, "India"));
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String country1 = request.getParameter("country1");
        String country2 = request.getParameter("country2");
        String match_type = request.getParameter("match_type");

        PrintWriter pw = response.getWriter();
        pw.write("Country1 :" + country1 + "<br>");
        pw.write("Country2 :" + country2 + "<br>");
        pw.write("Match Type :" + match_type + "<br>");
        for (int i = 0; i < match.size(); i++) {
            if (match.get(i).country1.equalsIgnoreCase(country1) && match.get(i).country2.equalsIgnoreCase(country2) && match.get(i).matchType.equalsIgnoreCase(match_type)) {
                pw.write(String.valueOf(match.get(i)));

            }
        }
    }
}
