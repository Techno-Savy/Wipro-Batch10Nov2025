package com.delegateapp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Service
class Manager implements Allocator
{


public void taskAllocation(String user)
{
System.out.println("Task is allocated by : Manager to " + user);
}

}