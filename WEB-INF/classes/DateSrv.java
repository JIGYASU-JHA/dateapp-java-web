import jakarta.servlet.*;
import java.io.*;

public class DateSrv extends GenericServlet{
    //implement service method 
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
        //set response content type
        res.setContentType("text/html");
        //get stream obj
        PrintWriter pw= res.getWriter();
        //write request processing logic
        java.util.Date d1= new java.util.Date();
        //write response content to the browser window through webserver
        pw.println("Date and Time is:" +d1.toString());
        // close stream obj
        pw.close();
    }
}
