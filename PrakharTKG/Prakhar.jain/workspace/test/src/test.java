

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class test
 */
@WebServlet("/test")
public class test extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
			{
		
		
		
		
		OutputStream out = res.getOutputStream();
		//ServletOutputStream out = response.getServletOutputStream();
			out.println("<html><body>Hello</body></html>");
			if ( ! res.flush() )
			if(req.getParameter("name") == null)
			{
			res.sendError(HttpServletResponse.SC_UNAUTHORIZED);
			}
			}

}