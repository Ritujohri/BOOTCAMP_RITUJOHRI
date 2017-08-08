package cdk.com.example;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RandomNumberServlet extends javax.servlet.http.HttpServlet {
    public void service(ServletRequest req, ServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter printWriter = res.getWriter();
        printWriter.write("<h1>Random number</h1> " +
                (int) (Math.random()*10000) +
                "<br> <h2>Current Date and Time :</h2> "+
                new SimpleDateFormat("yyyy/MM/dd \n HH:mm:ss").format(new Date()));

    }
}
