package com.mycompany.myapp.controller;

//역할 부여가 필요하다 컨트롤러 로 맵핑 해준다.컨트롤러 를 통해서 

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//컨트롤러가 부여된것은 컨트롤러 역할이다. 어노테이션 적용이 되어야 컨트롤러 역할을 하는 것이다 컨트롤러는 요청 처리를 한다.
@Controller
public class Exam02HtmlController {
@RequestMapping("html/exam01")//요청경로이다.http://localhost:8080/WebApplication 까지 생략된것이다./html 을 요청하면 메소드가 실행한다.웹페이지에 요청하는 요청 경로이고 실질적으로 파일을 찾는것은 return 으로 값을 찾는다.
	public String html(){
		return "html/exam01";//WEB-INF views .jsp 라는 파일이 리턴하게 된다.꼭 경로랑 같을 필요는 없다.
	}
}
