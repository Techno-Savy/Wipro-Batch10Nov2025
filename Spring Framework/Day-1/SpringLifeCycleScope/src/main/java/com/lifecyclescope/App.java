package com.lifecyclescope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.lifecyclescope.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// you have to first connect or call spring contatiner
		
    			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    			
    			// ask the container or spring to get the delegate bean  or object
    			Delegate delegate = context.getBean(Delegate.class);
    			
    			delegate.notifyUser();
    			context.close();
    }
}
