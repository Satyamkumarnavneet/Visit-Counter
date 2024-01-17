import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

import java.util.concurrent.atomic.AtomicInteger;

@WebListener
public class VisitCounterListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        // Initialize the visit count to 0 when the application starts
        ServletContext servletContext = servletContextEvent.getServletContext();
        servletContext.setAttribute("visitCount", new AtomicInteger(0));
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        // Perform cleanup (if any) when the application is being destroyed
    }
}
