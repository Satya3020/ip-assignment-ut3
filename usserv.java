import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class usserv extends HttpServlet {

  public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    String indexString = request.getParameter("index");

    int index = Integer.parseInt(indexString);
    String[] name = new String[]{"abc", "xyz", "lmn", "def","ghi"};
    String value =name[index];
    
    out.println("<html>");
    out.println("<body>");
    out.println("<h2>Hello" + value + "</h2>");
    out.println("</body>");
    out.println("</html>");
  }
}
