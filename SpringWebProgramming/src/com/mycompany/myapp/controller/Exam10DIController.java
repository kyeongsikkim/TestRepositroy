package com.mycompany.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.myapp.service.Exam10Service1;
import com.mycompany.myapp.service.Exam10Service2;
import com.mycompany.myapp.service.Exam10Service3;
import com.mycompany.myapp.service.Exam10Service6;	

@Controller
public class Exam10DIController{
	//생성자 주입은 안쓴다 기본적으로 생성자를 가지고 있어서 
	@Autowired //의미는 스프링이 관리하고 있는 객체중 exam10service 가 있으면 관리가 된다.
	private Exam10Service1 exam10Service1;//실제 대입대는 것은 인터페이스 구현 객체 
	@Autowired
	private Exam10Service2 exam10Service2;	
	@Autowired
	private Exam10Service3 exam10Service3;
	@Autowired
	private Exam10Service6 exam10Service6;

	@RequestMapping("/di/exam01")
	public String exam01(){
		System.out.println("exam01() 실행 ! ");
		exam10Service1.join();
		exam10Service2.join();
		exam10Service3.join();
		exam10Service6.join();
		return "di/exam01";
	}
	
	@RequestMapping("/di/exam02")
	public String exam02(){
		System.out.println("exam02() 실행 ! ");
		exam10Service1.login();
		exam10Service2.login();
		exam10Service3.login();
		exam10Service6.login();
		return "di/exam02";
	}
}
