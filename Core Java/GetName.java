import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class GetName extends HttpServlet {
	public void doGet (HttpServletRequest request,HttpServletResponse response)
	throws ServletException, IOException {
		response.setContentType(""text/html);
		PrintWriter out = response.getWriter();
		String fName = request.getParameter ("fName"),
			   lName = request.getParameter ("lName");
	}
}
