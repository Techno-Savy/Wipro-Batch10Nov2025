package com.configurationstyle;

import org.springframework.stereotype.Service;

@Service   // use this when you are using Annotation based configuration otherwise remove it 
class Manager implements Allocator
{
	
Manager()
{
System.out.println("Manager Bean Created");	
}
public void taskAllocation(String user)
{
System.out.println("Task is allocated by : Manager to " + user);
}



}