package com.delegateapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/* spring delegate app injection
 * Here spring will
 * create object 
 * decide which implementation to use
 * inject them automatically
 * allow switching using config, not with the code
 */


public class App {

	public static void main(String[] args) {
		
		// you have to first connect or call spring contatiner
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		// ask the container or spring to get the delegate bean  or object
		Delegate delegate = context.getBean(Delegate.class);
		
		delegate.notifyUser();
		context.close();
		
		
	}
}
