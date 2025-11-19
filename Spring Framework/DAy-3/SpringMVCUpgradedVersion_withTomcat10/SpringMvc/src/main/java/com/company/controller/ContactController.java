package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String showform()
	{
		
		return "contact";
	}
	
	// fetching the data from the form and the textbox or elements name and binds with the properties of model/bean/entity class
	// just ensure the property name and elements name must be same
	@RequestMapping(path="/processform" , method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model)
	
	{
		System.out.println(user);
		// setting the user object in a model class as an attribute 
		model.addAttribute("user",user);
		return "success";
	}
}
