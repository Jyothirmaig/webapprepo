package examples;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Simple Hello servlet.
 * Description of the Hello Servlet
In the preceding code:
The Hello class extends the javax.servlet.http.HttpServlet abstract class.
This abstract class provides a framework for handling the HTTP protocol.
When extending the HttpServlet abstract class, a programmer must override at least one method, depending on the type of requests the servlet supports, such as HTTP GET, HTTP POST, and so on.
The Hello servlet overrides the doGet method because it supports HTTP GET. 
The parameters of the method are the HTTP request and response.
The response.setContentType method tells the receiver of the response (such as a browser) that the response type is text/html, or simple HTML.
The response.getWriter method returns a PrintWriter object used to send character text to the client, in this case a browser.
The writer.println lines build an HTML file that will be rendered by the browser that invokes the servlet.
 */

public final class Hello extends HttpServlet {


    /**
     * Respond to a GET request for the content produced by
     * this servlet.
     *
     * @param request The servlet request we are processing
     * @param response The servlet response we are producing
     *
     * @exception IOException if an input/output error occurs
     * @exception ServletException if a servlet error occurs
     */
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
      throws IOException, ServletException {

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();        
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>Sample Application Servlet Page</title>");
        writer.println("</head>");
        writer.println("<body bgcolor=white>");

        writer.println("<table border=\"0\" cellpadding=\"10\">");
        writer.println("<tr>");
        writer.println("<td>");
        writer.println("<img src=\"images/springsource.png\">");
        writer.println("</td>");
        writer.println("<td>");
        writer.println("<h1>Sample Application Servlet</h1>");
        writer.println("</td>");
        writer.println("</tr>");
        writer.println("</table>");

        writer.println("This is the output of a servlet that is part of");
        writer.println("the Hello, World application.");

        writer.println("</body>");
        writer.println("</html>");
    }
} 