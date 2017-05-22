package com.mycompany.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class Exam01HomeController {
	@RequestMapping("/")//루트 이다 /표시앞에는  context 가 생략 된 것이다. 
	public String home(){
		System.out.println("home()");
		return "home";//앞에는 web-inf/views 생략이 된것이다.
	}	
	
	


}

