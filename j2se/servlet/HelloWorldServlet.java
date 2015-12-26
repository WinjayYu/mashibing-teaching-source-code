import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class HelloWorldServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  	PrintWriter out = resp.getWriter();
  	out.println("HelloWorld From Servlet!");
  }
}