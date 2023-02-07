package com.Xworkz.freezer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/servlet1")
public class FreezerServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{

//		request.getRequestDispatcher("/servlet2").forward(request, response);
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		writer.print("This message is from first servlet");
		request.getRequestDispatcher("/servlet2").include(request, response);
		writer.print("response came from second also , sending all the response");
		
}
}