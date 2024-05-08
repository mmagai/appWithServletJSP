package com.demo.code.MVCServletJSP;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.code.MVCServletJSP.entity.Student;
import com.demo.code.MVCServletJSP.model.StudentDataUtil;

/**
 * Servlet implementation class MvcDemoServlet
 */
@WebServlet("/MvcDemoServlet")
public class MvcDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Get the Data from Helper Class (Model)
		List<Student> studentList = 
				StudentDataUtil.getStudent();
		
		
		// Add those data in the Request
		request.setAttribute("studentList", studentList);
		
		
		
		// Create a Request Dispatcher which will redirect those data to the JSP
		RequestDispatcher disptacher = request.getRequestDispatcher("view-student-List.jsp");
		
		// forward all those data to the Specified JSP
		disptacher.forward(request, response);
		
		
	}

}
