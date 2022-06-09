package com.stgcodes.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SimpleFormController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "simple-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "processed-form";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String generateMessage(HttpServletRequest request, Model model) {
		
		//read the request parameter form the HTML form
		String name = request.getParameter("studentName");
		
		//do things with the data
		name = name.toUpperCase();
		
		//create a message
		String result = "Yo, " + name + "!";
		
		//add the message to the model
		model.addAttribute("message", result);
		
		return "processed-form";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String generateMessageVersionThree(@RequestParam("studentName") String name, Model model) {
		
		//do things with the data
		name = name.toUpperCase();
		
		//create a message
		String result = name + " showed up to the v3 party!";
		
		//add the message to the model
		model.addAttribute("message", result);
		
		return "processed-form";
	}
}
