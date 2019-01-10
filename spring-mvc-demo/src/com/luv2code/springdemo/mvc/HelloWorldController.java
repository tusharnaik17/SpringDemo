package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	// Need a controller method to show the initial form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	// Need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	// Need a controller method to read form data and
	// add data to model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		//read the request parameter from the HTML form
		String theName = request.getParameter("studentName");
		
		//convert data to all caps
		theName = theName.toUpperCase();
		
		//create the message
		String result = "YO! " +theName;
		
		//add message to model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	

	//Use @RequestParam("StudentName") String theName instead of HttpServletRequest request
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
		
		//read the request parameter from the HTML form
		//String theName = request.getParameter("studentName");
		
		//convert data to all caps
		theName = theName.toUpperCase();
		
		//create the message
		String result = "Hey My Friend : " +theName;
		
		//add message to model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}
