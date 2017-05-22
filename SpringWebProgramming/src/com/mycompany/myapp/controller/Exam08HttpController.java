package com.mycompany.myapp.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller//클래스 위에 컨트롤러 를 달아준다.
@RequestMapping("/http")
public class Exam08HttpController {
	//요청 방식에 따라서 요청경로가 같아도 다른 것을 실행 시킬수 있다.
	@RequestMapping(value="/exam01",method=RequestMethod.GET)
	public String exam01Get(){
		System.out.println("exam01Get()...");
		return "http/exam01";
	}
	@RequestMapping(value="/exam01",method=RequestMethod.POST)
	public String exam01Post(){
		System.out.println("exam01Post()...");
		return "http/exam01";
	}
	@RequestMapping("/exam02")
	public String exam02(HttpServletRequest request,Model model){
		
		
		String method=request.getMethod();
		String uri=request.getRequestURI();
		String queryString=request.getQueryString();
		String type=request.getParameter("type");
		int bno=Integer.parseInt(request.getParameter("bno"));
		String[]hobby=request.getParameterValues("hobby");//두개의 정보가 넘어올때는 value 의 값으로 한다.
		
		String userAgent=request.getHeader("User-Agent");
		if(userAgent.contains("MSIE") || userAgent.contains("Trident")){
			userAgent="IE11 이하 브라우저";
		}else if(userAgent.contains("Edeg")){
			userAgent="엣지브라우저";
		}else if(userAgent.contains("Chrome")){
			userAgent="크롬브라우저";
		}
		model.addAttribute("method",method);
		model.addAttribute("uri",uri);
		model.addAttribute("queryString", queryString);
		model.addAttribute("type", type);
		model.addAttribute("bno", bno);
		model.addAttribute("hobby",hobby);
		model.addAttribute("userAgent", userAgent);
		
		return "http/exam02";
	}
	@RequestMapping("/exam03")
	public String exam03(@RequestParam("type") String kind,@RequestParam int bno,@RequestParam String[] hobby,@RequestHeader("User-Agent") String userAgent,Model model){//파라미터 이름과 변수명 이름이 같을 때만 넣어준다.
		//requestParm 의 생략도 가능하다
		//변수명만 같으면 대입이 가능하다 
		//변수명이 다를경우는 앞에다가 붙여준다
		//변수명이 다를 경우는 앞에 붙여주면 들어가지만 변수명이 같을 경우는 Requestparam 의 생략이 가능하다.
		//헤더에서 찾아라 RequestHeader 을 생략해주면은 요청 파라미터에서 매개변수와 동일한것을 찾기때문에 RequestHeader 은 꼭 넣어줘야 한다. 
		model.addAttribute("type", kind);
		model.addAttribute("bno", bno);
		model.addAttribute("hobby",hobby);
		model.addAttribute("userAgent", userAgent);
		return "http/exam02";
	}
}
