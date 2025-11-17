package com.dependencyinjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
	public static void main( String[] args )
    {
    	// you have to first connect or call spring contatiner
		
    			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    			
    			// ask the container or spring to get the delegate bean  or object
    			//DelegateFieldDI delegate = context.getBean(DelegateFieldDI.class);
    			
    			DelegateSetterDI delegate = context.getBean(DelegateSetterDI.class);
    			
    			//DelegateConstructorDI delegate = context.getBean(DelegateConstructorDI.class);
    			
    			delegate.notifyUser();
    			context.close();
    }
}
