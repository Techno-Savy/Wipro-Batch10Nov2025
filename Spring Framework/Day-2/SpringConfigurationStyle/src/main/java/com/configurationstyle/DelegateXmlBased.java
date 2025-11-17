package com.configurationstyle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class DelegateXmlBased{

	// Here delegate depends upon interface only  -- 
  private final Allocator allocator; // depends on abstraction // required  + final
	

  
  //@Annotation we have removed to do it with XML based configstyle which will take the configuration via applicationContext.xml
  //create applicationContext.xml in src/main/resources
   
 
  // dependency injection will be done by Spring via XML BASED CONFIG
  public DelegateXmlBased(Allocator allocator) { 
	  // This is construction injection
	  // spring will creates Manager and spring will call the constructor of Delegate and injects Manager
	  // here object is ready and fully valid where there is no chance of null values 
		super();
		this.allocator = allocator;
		System.out.println("Inside Delegate Constructor - Allocator Impl: " + allocator.getClass().getSimpleName());
	  };
   
  
public void notifyUser()
{
//manager.taskAllocation("Niti");
	
	allocator.taskAllocation("Niti");
 
}

}
