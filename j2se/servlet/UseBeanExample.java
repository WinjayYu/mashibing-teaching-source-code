import java.io.*;
import java.text.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import ij.*;

/**
 * Servlet怎样使用Bean的例子
 */

public class UseBeanExample extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws IOException, ServletException
    {
        response.setContentType("text/html; charset=gb2312");
	String title="使用Bean的示例";

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body bgcolor=\"white\">");
        out.println("<head>");
        out.println("<title>"+title+"</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h3>" + title + "</h3>");
        if (request.getParameter("source")!=null) {
          String source=new String(request.getParameter("source").getBytes("8859_1"));
          out.println("<P>");
          if (source!= null&&!source.equals("")) {
            out.print("源字符串为:"+"<br>");
	    out.print("<b>"+source+"</b>");
	    Unicoder parser=new Unicoder(source);
	    out.print("<br>");
            out.print("Unicode为:");
	    out.print("<br>");
	    out.print("<b>"+parser.getUnicode()+"</b>");
          }
	  else {
	    out.println("参数出错");
	  }
        }
        out.println("</P>");
        out.print("<form action=\"");
        out.print("UseBeanExample\" ");
        out.println("method=get>");
        out.println("请输入源字符串:");
        out.println("<input type=text size=20 name=source>");
        out.println("<br>"+"<input type=submit value=\"确定\">");
	out.println("<input type=reset value=\"取消\">");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }
}
