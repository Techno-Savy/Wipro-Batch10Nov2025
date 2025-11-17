package com.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DelegateSetterDI{

	// Here delegate depends upon interface only  -- 
  private  Allocator allocator; // depends on abstraction // optional use
	//if Dependency may change after object creation then remove final keyword from here
  // dependency injection will be done by Spring but how by adding an annotation @Autowired
 
  @Autowired
  public void setAllocator(Allocator allocator) {
		this.allocator = allocator;
		System.out.println("Setter injection -- > allocator injected:" + allocator.getClass().getSimpleName());
		
	}
  
  
  
public void notifyUser(){
//manager.taskAllocation("Niti");
	
	allocator.taskAllocation("Niti");}

}
