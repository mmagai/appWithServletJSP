package com.demo.code.servletGenerateData;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentDataGenerationServlet
 */
@WebServlet("/StudentDataGenerationServlet")
public class StudentDataGenerationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nameList[] = {"Mahesh", "Aishu","Magai"};
		
		// Add those data in request
		request.setAttribute("listOfStudent", nameList);
		
		
		// Create Request Dispatcher to send the Data JSP
		RequestDispatcher dispatcher = request.getRequestDispatcher("view-student.jsp");
		
		dispatcher.forward(request, response);
		
	}

}
