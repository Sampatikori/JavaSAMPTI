import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/form")
public class GameServlet extends HttpServlet {

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		response.setContentType("text/html");
		
		PrintWriter writer= response.getWriter();
		writer.print("<html><body>");
		writer.print("<form action='form' method='post'>");
		writer.println("<div>Name : <input type = 'text' name = 'name'></div>" );
		writer.println("<div>Email : <input type = 'text' name = 'email'></div>");
		writer.print("<div><button type = 'submit' name = 'submit'>submit </button></div></form>");
		
		}
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
        response.setContentType("text/html");
		
		PrintWriter writer= response.getWriter();
		
		writer.print("submitted");
		writer.print("Name : " + name);
		writer.print("Email : " + email);
		
		System.out.println("Name : " + name);// to get print in console
		System.out.println("Email : " + email);
		
		
		
		
		
		
		
	
}
}