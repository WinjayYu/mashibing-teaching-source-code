import java.io.*;
import java.text.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import ij.*;

/**
 * Servlet����ʹ��Bean������
 */

public class UseBeanExample extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws IOException, ServletException
    {
        response.setContentType("text/html; charset=gb2312");
	String title="ʹ��Bean��ʾ��";

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
            out.print("Դ�ַ���Ϊ:"+"<br>");
	    out.print("<b>"+source+"</b>");
	    Unicoder parser=new Unicoder(source);
	    out.print("<br>");
            out.print("UnicodeΪ:");
	    out.print("<br>");
	    out.print("<b>"+parser.getUnicode()+"</b>");
          }
	  else {
	    out.println("��������");
	  }
        }
        out.println("</P>");
        out.print("<form action=\"");
        out.print("UseBeanExample\" ");
        out.println("method=get>");
        out.println("������Դ�ַ���:");
        out.println("<input type=text size=20 name=source>");
        out.println("<br>"+"<input type=submit value=\"ȷ��\">");
	out.println("<input type=reset value=\"ȡ��\">");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }
}
