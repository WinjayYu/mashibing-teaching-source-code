package s1;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

/**
 * 用于演示Servlet API中的Session管理机制
 */
public class SessionInfoServlet extends HttpServlet
{
  /**
   * Builds an HTML document containing session information and
   * returns it to the client.
   */
  public void doGet(HttpServletRequest request,
    HttpServletResponse response) throws ServletException,
    IOException
  {
    //get current session or, if necessary, create a new one
    HttpSession mySession = request.getSession(true);

    //MIME type to return is HTML
    response.setContentType("text/html");

    //get a handle to the output stream
    PrintWriter out = response.getWriter();

    //generate HTML document
    out.println("<HTML>");
    out.println("<HEAD>");
    out.println("<TITLE>Session Info Servlet</TITLE>");
    out.println("</HEAD>");
    out.println("<BODY>");
    out.println("<H3>Session Information</H3>");
    out.println("New Session: " + mySession.isNew());
    out.println("<BR>Session ID: " + mySession.getId());
    out.println("<BR>Session Creation Time: " +
      new java.util.Date(mySession.getCreationTime()));
    out.println("<BR>Session Last Accessed Time: " +
      new java.util.Date(mySession.getLastAccessedTime()));

    out.println("<H3>Request Information</H3>");
    out.println("Session ID from Request: " +
      request.getRequestedSessionId());
    out.println("<BR>Session ID via Cookie: " +
      request.isRequestedSessionIdFromCookie());
    out.println("<BR>Session ID via rewritten URL: " +
      request.isRequestedSessionIdFromURL());
    out.println("<BR>Valid Session ID: " +
      request.isRequestedSessionIdValid());

    out.println("</BODY></HTML>");

    out.close(); //close output stream
  }


  /**
   * Returns a brief description of this servlet.
   *
   * @return Brief description of servlet
   */
  public String getServletInfo()
  {
    return "Servlet returns session information.";
  }
}