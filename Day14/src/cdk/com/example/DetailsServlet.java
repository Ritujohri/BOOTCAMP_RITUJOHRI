package cdk.com.example;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "DetailsServlet")
public class DetailsServlet extends HttpServlet {
    public void service(ServletRequest req, ServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter printWriter = res.getWriter();
        printWriter.write("Name : Ritu Johri" );
        printWriter.write("Company : Cdk Global" );

    }
}
