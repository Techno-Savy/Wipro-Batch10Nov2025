package com.configurationstyle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // remove it if it is a xml based config or Java based config style
public class DelegateAnnotationBased{

	// Here delegate depends upon interface only  -- 
  private final Allocator allocator; // depends on abstraction // required  + final
	
  
  @Autowired  // remove it when you use XML Based CONFIG or Java Based Config
  public DelegateAnnotationBased(Allocator allocator) { 
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
