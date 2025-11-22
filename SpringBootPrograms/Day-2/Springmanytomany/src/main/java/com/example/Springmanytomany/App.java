package com.example.Springmanytomany;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.Springmanytomany.service.StudentService;
import com.example.Springmanytomany.Config.AppConfig;
import com.example.Springmanytomany.entity.Courses;
import com.example.Springmanytomany.entity.Student;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        
	    
        StudentService service =  ctx.getBean(StudentService.class);
        Student student = new Student("anusha");
        student.addCourse(new Courses("java"));
        student.addCourse(new Courses("servlet"));
        
       
      
         service.saveData(student);
         Student fetchedStudent = service.getStudent(1L);
      // fetchedStudent.getCourses().forEach(c->System.out.println(c.getTitle()));
         System.out.println(fetchedStudent);
    
         
       
    }
}
