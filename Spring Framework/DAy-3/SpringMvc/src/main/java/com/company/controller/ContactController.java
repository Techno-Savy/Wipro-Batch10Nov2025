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
	@RequestMapping(path="/processform" , method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model)
	
	{
		System.out.println(user);
		model.addAttribute("user",user);
		return "success";
	}
}
