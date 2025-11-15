package com.lifecyclescope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Delegate{

	// Here delegate depends upon interface only
  private Allocator allocator; // depends on abstraction 
	
  // dependency injection will be done by Spring but how by adding an annotation @Autowired
  @Autowired
  public Delegate(Allocator allocator) {
		super();
		this.allocator = allocator;
	  };
  
  
  
public void notifyUser()
{
//manager.taskAllocation("Niti");
	
	allocator.taskAllocation("Niti");




 
}

}
