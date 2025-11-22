package com.example;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.model.Course;
import com.example.model.ReportCard;
import com.example.model.Student;
import com.example.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// to obtain/get the session from sessionfactory (It can be multiple session based on multiple services or work)
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		// To create a  transaction ( Transient + Persistent) -- Transient when you do not to reflect and save in backend  but persistent to save into a backend
	   Transaction tx = session.beginTransaction();
	   
	   Student s =  new Student("Niti");
	   
	   s.addCourse(new Course("Java"));
	   s.addCourse(new Course("PD"));
	   
	   ReportCard rc = new ReportCard(450);     
	   s.setReportcard(rc);
	   	   
	   session.persist(s);
	   
	   tx.commit();
	   
	   session.close();
	   
	   Session getSession = HibernateUtil.getSessionFactory().openSession();
	   Student stud = getSession.get(Student.class,1L);
	   System.out.println("Student Details :" + s.getName());
	   s.getCourses().forEach(c->System.out.println("Courses enrolled for : "+ c.getTitle()));
	   getSession.close(); 
	   
	   /* for bidirectional
	     Course c = session.get(Course.class,1L)
	     // One course is enrolled by multiple students 
	     System.out.println("Course :" + c.getTitle() + " belongs to Student: " + c.getStudent().getName());
	    */
	   
    }
}
