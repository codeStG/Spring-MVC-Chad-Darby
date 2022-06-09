package com.stgcodes.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimpleControllerVersionTwo {

	@RequestMapping("/showForm")
	public String showForm() {
		return "";
	}
}
