package com.company.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/users")
public class HomeController {

	@RequestMapping(path="/home", method=RequestMethod.GET)
	public String home(Model model)
	{
		System.out.println("This is home URL");
		model.addAttribute("name", "Niti Dwivedi");
		model.addAttribute("Designation", "Trainer");
		return "index";  //Return view page and view resolver will resolve this page
	}
	
	@RequestMapping("/about")
	public String about()
	{
		
		return "about";  //Return view page and view resolver will resolve this page
	}
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		//creating an object of model and view
		ModelAndView modelAndView = new ModelAndView();
		
		//setting the data
		modelAndView.addObject("name", "Niti Dwivedi");
		modelAndView.addObject("RollNo", 1234);
		//setting the marks in list form 
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(3456);
		list.add(2134);
		modelAndView.addObject("marks",list);
		
 		//setting the view name
		modelAndView.setViewName("help");   // the extra line here that we need to set the view name also in ModelAndView object
		
		return modelAndView;  //Return the modelandview object where we have set the view page with the name as help and view resolver will resolve this page
	}
}
