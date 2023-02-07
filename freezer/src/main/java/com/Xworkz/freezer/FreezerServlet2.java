package com.Xworkz.freezer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/servlet2")
public class FreezerServlet2 extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		writer.println("<div>Hello Sampati Kori</div>");
		writer.println("<div>This is from servlet2</div>");
		
	}

}
