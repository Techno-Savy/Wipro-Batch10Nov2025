package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
//@ResponseBody // use this annotation when you want to return as a String Value instead of JSP  as spring won't return UI 
public class HomeController {

	
	@RequestMapping(path="/home", method=RequestMethod.GET)
	public String home(Model model)
	{
		System.out.println("This is home URL");
		model.addAttribute("name", "Niti Dwivedi");
		model.addAttribute("Designation", "Trainer");
		return "index";  //Return view page and view resolver will resolve this page
	}
}
