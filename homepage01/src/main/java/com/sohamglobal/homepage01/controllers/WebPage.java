package com.sohamglobal.homepage01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class WebPage {
	
	@GetMapping("/")
	public String homepage() {
		return "index.html";
	}
	

}
