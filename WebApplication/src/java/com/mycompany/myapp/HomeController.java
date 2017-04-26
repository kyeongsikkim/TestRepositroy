package com.mycompany.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home(){
		System.out.println("home()");
		return "home";
	}
	@RequestMapping("/html")
	public String html(){
		return "html";
	}
	@RequestMapping("/css/exam01")
	public String cssExam01(){
	return "css/exam01";
	}
	@RequestMapping("/css/exam02")
	public String cssExam02(){//메소드 이름은 별개
	return "css/exam02";
			
	}
	@RequestMapping("/css/exam03")
	public String cssExam03(){//메소드 이름은 별개
	return "css/exam03";
			
	}
	@RequestMapping("/javascript/exam01")
	public String javascriptExam01(){
	return "javascript/exam01";
			
	}
	@RequestMapping("/javascript/exam02")
	public String javascriptExam02(){
		return "javascript/exam02";
	}
	@RequestMapping("/javascript/exam03")
	public String javascriptExam03(){
		return "javascript/exam03";
	}
	
	@RequestMapping("/javascript/exam04")
	public String javascriptExam04(){
		return "javascript/exam04";
	}
}


