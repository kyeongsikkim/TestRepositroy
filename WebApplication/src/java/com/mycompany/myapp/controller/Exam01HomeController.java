package com.mycompany.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class Exam01HomeController {
	@RequestMapping("/")//루트 이다 /표시는 
	public String home(){
		System.out.println("home()");
		return "home";
	}	
	
	


}

