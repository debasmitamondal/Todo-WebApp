package com.in28minutes.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.in28minutes.todo.TodoService;

@WebServlet(urlPatterns = "/todo.do")
public class TodoServlet extends HttpServlet{	
		
	TodoService todoService = new TodoService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		request.setAttribute("todos", todoService.retriveTodos());
		request.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		//adding new parameter		
		String newTodo= request.getParameter("todo");
		String newCategory= request.getParameter("category");
		todoService.addTodo(new Todo(newTodo,newCategory)); //first parameter is added
		response.sendRedirect("/todo.do"); // then get request is fired page is loaded , avoidss duplicate submit
	}
}
