package com.company.HibernateORM;



import org.hibernate.Session;
import org.hibernate.Transaction;

import com.company.HibernateORM.Util.HibernateUtil;
import com.company.HibernateORM.model.Student;



/**
 * Hello world!
 *
 */
public class App 
{
	
	
	@SuppressWarnings("removal")
	public static void main( String[] args )
    {
		// 1. to get the session from sessionfactory 
		//(It can be multiple session based on multiple services or work)
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		// 2. To create a  transaction ( Transient + Persistent(saving and obtaining)) -- 
		//Transient when you do not to reflect and bydefault it is transient and then use persist method to 
		//save in backend which is persistent 
	   Transaction tx = session.beginTransaction();
	   
	   Student s1 = new Student("niti","niti@gmail" , "hibernatecourse");
	   
		session.persist(s1); // we are persisting the data from transient (by default it is transient)
		
		Student data = session.get(Student.class,s1.getId()); // retreiving the data from session
		System.out.println("Data id : " + data); // displaying on a console
	
		tx.commit(); // Here it will added finally to the database after committed
		
    }
}
