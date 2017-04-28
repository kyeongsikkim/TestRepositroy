package com.mycompany.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jsp")//URL 공통으로 집어 넣을것 
public class Exam07JspController {

	@RequestMapping("/exam01")
	public String exam01() {
		return "jsp/exam01";
	}

	@RequestMapping("/exam02")
	public String exam02() {
		return "jsp/exam02";
	}
	@RequestMapping("/exam03")
	public String exam03() {
		return "jsp/exam03";
	}

}
