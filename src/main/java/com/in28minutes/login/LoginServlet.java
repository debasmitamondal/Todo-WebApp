package com.in28minutes.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.in28minutes.todo.TodoService;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet{
	
	UserValidationService service = new UserValidationService();	
	TodoService todoService = new TodoService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		//String name = request.getParameter("name");
		//request.setAttribute("name", name);
		/* redirecting to jsp page*/
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		
	}
	  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	//redirects to welcome.jsp page 
		String name= request.getParameter("name");
		String password = request.getParameter("password");
		
		if(service.isValidUser(name, password)) {
			
		//request.setAttribute("todos", todoService.retriveTodos());
		request.getSession().setAttribute("name", request.getParameter("name"));
		//request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		/* redirecting to another servlet*/
		response.sendRedirect("/todo.do");
		}
		else
		{
			request.setAttribute("errorMsg", "Invalid Credentials");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
	}
}
