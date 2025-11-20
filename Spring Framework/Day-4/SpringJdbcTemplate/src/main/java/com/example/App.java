package com.example;

/**
 * Hello world!
 *
 */


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.beans.Todo;
import com.example.config.JdbcConfig;
import com.example.dao.TodoDao;
import com.example.dao.TodoDaoImpl;



//controller
public class App 
{


	public static void main(String[] args)
	{
		ApplicationContext context= new AnnotationConfigApplicationContext(JdbcConfig.class);
		TodoDao dao=context.getBean(TodoDaoImpl.class);

		
//		Todo todo = new Todo(1,"task1","task1 so and so");
//		Todo todo1 = new Todo(2,"task2","task2 so and so");
//		Todo todo2 = new Todo(3,"task3","task3 so and so");
//		Todo todo3 = new Todo(4,"task4","task4 so and so");
//
//		dao.saveTodo(todo);
//		dao.saveTodo(todo1);
//		dao.saveTodo(todo2);
//		dao.saveTodo(todo3);
//		


		
		
//				Todo todo1 = new Todo(2,"task2","coding");
//				dao.updateTodo(todo1);
//				
//				dao.getAllTodos();

		System.out.println(dao.getTodo(4));
		 dao.deleteTodo(4);


		 List<Todo> todos= dao.getAllTodos();
		for(Todo t:todos)
		{
			System.out.println(t);
		}





	}

}
