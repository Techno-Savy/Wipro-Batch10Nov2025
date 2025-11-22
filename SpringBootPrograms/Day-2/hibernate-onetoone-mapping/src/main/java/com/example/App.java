package com.example;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.model.ReportCard;
import com.example.model.Student;
import com.example.util.HibernateUtil;


public class App 
{
    public static void main( String[] args )
    {
       
    	// to obtain/get the session from sessionfactory (It can be multiple session based on multiple services or work)
    			Session session = HibernateUtil.getSessionFactory().openSession();
    			
    			// To create a  transaction ( Transient + Persistent) -- Transient when you do not to reflect and save in backend  but persistent to save into a backend
    		   Transaction tx = session.beginTransaction();
    		   
    		   Scanner sc = new Scanner(System.in);
    		   System.out.println("Enter student name");
    		   String name = sc.next();
    		   System.out.println("Enter student marks");
    		   Long marks = sc.nextLong();
    		   
    		   
    		   ReportCard rc = new ReportCard(marks);
    		   Student s =  new Student(name);
    		   
    		    s.setReportcard(rc);
    		    
    		     // uncomment if you made it as bidirectional 
    		    rc.setStudent(s); 
    		 
    		    // CascadeType.ALL we have used it so hibernate will ensure that the child class i.e. Report card will be saved automatically
    		   session.persist(s);
    		   
    		   tx.commit();
    		   
    		   System.out.println("Transaction Committed");
    		   
    		   /* Unidirectional Display
    		   Student s1 = session.get(Student.class, 1L);
   		   System.out.println("Student details are below :" + s1);*/
    		   
    		   // Uncomment it to see the bidirectional implementation wherein with the report class reference we are displaying student class details 
    		   ReportCard rc1 = session.get(ReportCard.class, 1L); 
    		   System.out.println("Report Card Details :" + rc1.getMarks());
    		   
    		   Student s1 = rc1.getStudent(); //  here report card entity object is returning student class object
    		   System.out.println("Student details via Report Card :" + s1.getName());
    		   
    		   
    }
}
