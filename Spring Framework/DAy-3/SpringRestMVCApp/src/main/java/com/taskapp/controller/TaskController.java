package com.taskapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // RestController is the combination of @Controller + @ResponseBody
public class TaskController {
	
	@GetMapping("/task")
	public String getTask()
	{
		return "Spring MVC rest api is working";
	}

}
