package com.delegateapp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
class TeamLead implements Allocator
{


public void taskAllocation(String user)
{
System.out.println("Task is allocated by : TeamLead  to " + user);
}

}