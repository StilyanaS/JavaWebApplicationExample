package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// send HTML page to client
		out.println("<html>");
		out.println("<head><title>Formmulario</title></head>");
		out.println("<body>");
		out.println("<h1>Ejemplo Servlet</h1>");
		out.println("<form action=\"/MyServlet2\">>");
		out.println("<label for=\"fname\">First name:</label><br>");
		out.println("<input type=\"text\" id=\"name\" name=\"nombre\" value=\"Tu nombre\"><br>");
		out.println("<input type=\"submit\" value=\"Submit\">");
		out.println("</form>");
		out.println("</body></html>");
	}

}