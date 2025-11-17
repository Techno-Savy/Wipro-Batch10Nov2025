package com.configurationstyle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main( String[] args ) {
    	// you have to first connect or call spring contatiner
		
	/* Annotation based config where we have called AnnotationBasedConfig.class in AnnotationConfigApplicationContext> */		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationBasedConfig.class);
		
	// ask the container or spring to get the delegate bean  or object
		
				DelegateJavaBasedConfig delegate = context.getBean(DelegateJavaBasedConfig.class);
			
				delegate.notifyUser();
				context.close();
		
		
		
	/* In XML based config style where we have called applicationContext.xml file in AnnotationConfigApplicationContext> */
    	
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
	// ask the container or spring to get the delegate bean  or object
		
		//    	DelegateConstructorDI delegate = context.getBean("delegate" , DelegateConstructorDI.class);			
		//    	delegate.notifyUser();
		//    	((ClassPathXmlApplicationContext)context).close();
		
		
		
		/* Java  based config where we have called JavaConfig.class in AnnotationConfigApplicationContext> */

		 //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

	// ask the container or spring to get the delegate bean  or object
				
		//		DelegateConstructorDI delegate = context.getBean("delegate" , DelegateConstructorDI.class);	
		//    	delegate.notifyUser();
		//    	context.close();
    	
    }
}
