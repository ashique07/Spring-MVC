package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm()
	{
		return "helloworld-form"; //view name
	}

	@RequestMapping("/processForm")
	public String processForm()
	{
		return "hello-world";
		
	}
	
	//new controller method to read form data and adding data to a model
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model)
	{
		//read request parameter from HTML Form
		String theName = request.getParameter("studentName");
		
		//Do work on the data
		theName = theName.toUpperCase();
		
		String result = "Not using @RequestParam to read HTML Form Data : " + theName;
		
		//Add message to model
		model.addAttribute("message", result);
		
		return "hello-world";
	}
	
	
	//new controller method to read form data with @RequestParam and adding data to a model 
	@RequestMapping("/processFormVersionThree")
	public String letsShoutDude(
			@RequestParam("studentName") String theName, 
			Model model)
	
	{
		//Behind the scene
		//String theName = request.getParameter("studentName");
		
		//Do work on the data
		theName = theName.toUpperCase();
		
		String result = "Using @RequestParam to read HTML Form Data : " + theName;
		
		//Add message to model
		model.addAttribute("message", result);
		
		return "hello-world";
	}
}