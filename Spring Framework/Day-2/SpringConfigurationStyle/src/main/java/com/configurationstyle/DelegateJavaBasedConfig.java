package com.configurationstyle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class DelegateJavaBasedConfig{

	// Here delegate depends upon interface only  -- 
  private final Allocator allocator; // depends on abstraction // required  + final
	

    //@Annotation we have removed to do it with JavaConfig based configstyle which will take the configuration via JavaConfig.java
  //create JavaConfig class in src/main/java
  
   
  //dependency injection will be done by Spring via JAVA CONFIG 
     public DelegateJavaBasedConfig(Allocator allocator) { 
	  // This is a construction based injection
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
