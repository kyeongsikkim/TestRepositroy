package com.mycompany.myapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class Exam01HomeController {
	//모든 클래스에 안넣기 위해서 static 을 사용하고 값이 안바뀌기 위해서 final 을 붙여서 사용한다.
	private static final Logger LOGGER=LoggerFactory.getLogger(Exam01HomeController.class);
	@RequestMapping("/")//루트 이다 /표시앞에는  context 가 생략 된 것이다. 
	public String home(){
		LOGGER.info("/요청 처리함");
		System.out.println("home()");
		return "home";//앞에는 web-inf/views 생략이 된것이다.
	}	
}

