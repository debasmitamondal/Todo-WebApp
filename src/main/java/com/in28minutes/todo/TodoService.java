package com.in28minutes.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	
	public static List<Todo> todos = new ArrayList<Todo>();
	
	static {
		todos.add(new Todo("To create Web Applications","Study"));
		todos.add(new Todo("To learn Struts 2","Study"));
		todos.add(new Todo("To learn tag libraries and tiles concept","Study"));
	}

	public List<Todo> retriveTodos(){
	return todos;
	}
	
	public void addTodo(Todo todo) {
		todos.add(todo);
	}
	
	public void deleteTodo(Todo todo) {
		todos.remove(todo);
	}
}
