package com.delegateapp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
class ProductOwner implements Allocator
{


public void taskAllocation(String user)
{
System.out.println("Task is allocated by : Product Owner to " + user);
}

}