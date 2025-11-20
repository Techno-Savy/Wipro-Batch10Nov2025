package com.company.HibernateORM.Util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	
	private static final SessionFactory sessionFactory = build();
	
	
	 private static SessionFactory build()  {
	        try {
	            // Create the SessionFactory from hibernate.cfg.xml
	        		        	
	     return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	        	
	          
	        }
	        catch (Exception ex) {
	            // Make sure you log the exception, as it might be swallowed
	            throw new RuntimeException("Initial SessionFactory creation failed." + ex);
	           
	        }
	    }
	 
	 public static SessionFactory getSessionFactory()
	 {
		 return sessionFactory;
	 }


	 public static void   close()
	 {
		  sessionFactory.close();
		 	 }
}
