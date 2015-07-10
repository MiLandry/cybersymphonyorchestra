package hamsterofdark;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class BlogServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
//		resp.setContentType("text/plain");
//		resp.getWriter().println("Hello, world");
		
//		RequestDispatcher view = request.getRequestDispatcher("html/spring.html");
		RequestDispatcher view = request.getRequestDispatcher("/jsp/spring.jsp");
		view.forward(request, response);

		
	}
}
