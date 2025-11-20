package com.example.springhiborm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.springhiborm.entity.Student;
import com.example.springhiborm.service.StudentService;

/**
 * Hello world!
 *
 */


public class App 
{
	//Controller -- which is a entry point
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        
    
      StudentService service =  ctx.getBean(StudentService.class);
       
       service.create(new Student("Niti" , "niti@gmail.com" , "Python"));
       service.create(new Student("Jatin" , "jatin@gmail.com" , "MySql"));
    
       System.out.println("___________All Student Data ________");
       System.out.println("All Students list :" + service.list());
    
       System.out.println("___________Student based on ID ________");
    
	   Student s =  service.get(1L);
	   System.out.println("Student with id 1 :" + s);
    
    }
}
