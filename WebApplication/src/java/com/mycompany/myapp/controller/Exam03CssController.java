package com.mycompany.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/css")//css 라는 공통 경로를 컨트롤러에서 작성을 하고나서 밑에 꺼는 빼도 된다.
public class Exam03CssController {
	@RequestMapping("/exam01")//앞에 http://localhost:8080/WebApplication/css/ 까지 생략 되어 있다.공통경로를 한곳에서만 작성하는 방법 
	public String cssExam01(){
		return "css/exam01";
	}
	
	@RequestMapping("/exam02")//@RequestMapping("/css/exam02")
	public String cssExam02(){
		return "css/exam02";
	}
	
	@RequestMapping("/exam03")
	public String cssExam03(){
		return "css/exam03";
	}
}
