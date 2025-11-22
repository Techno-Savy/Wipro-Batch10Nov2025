package com.wipro.onetomany;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.onetomany.config.AppConfig;
import com.wipro.onetomany.entity.Courses;
import com.wipro.onetomany.entity.ReportCard;
import com.wipro.onetomany.entity.Student;
import com.wipro.onetomany.service.StudentService;


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
        Student student = new Student("jiya");
        student.addCourse(new Courses("java"));
        student.addCourse(new Courses("servlet"));
        
        ReportCard rc = new ReportCard(490);
      
         student.setReportcard(rc);
         service.saveData(student);
       
         
       
    }
}
