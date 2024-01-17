import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/VisitCounter")
public class VisitCounter extends HttpServlet {
    private int visitCount;

    public void init() {
        // Initialize the visit count to 1 when the servlet is initialized
        visitCount = 1;
    }

    public void service(HttpServletRequest request, HttpServletResponse response) {
        try {
            // Set the response content type
            response.setContentType("text/html");

            // Get the PrintWriter
            PrintWriter out = response.getWriter();

            // Display the visit count on the webpage
            out.println("<html><head><title>Visit Counter</title></head><body>");
            out.println("<h1>Visit Count: " + visitCount + "</h1>");
            out.println("</body></html>");

            // Increment the visit count for the next request
            visitCount++;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
