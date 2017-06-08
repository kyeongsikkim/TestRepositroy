package com.mycompany.myapp.controller;

import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.mycompany.myapp.dto.Exam13Member;

@Controller
@SessionAttributes(value={"name1,name2,member"})//name1 과 name2 member 키는 세션에 저장해야할 값이다.3개의 키는 session 에 있는 attribute 에 저장이 되야
public class Exam13CookieAndSessionController {
	private Logger LOGGER=LoggerFactory.getLogger(Exam13CookieAndSessionController.class);
	@RequestMapping("/cookie/exam01")
	public String exam01(HttpServletResponse response) throws Exception{
		//쿠키 생성
		Cookie cookie1=new Cookie("name1","hongkildong");//쿠키 이름과 value 를 넣어줘야 한다.반드시 아스키 문자여야 한다.
		//쿠키는 아스키 코드 헤더에 포함이 된다.  한글은 인코딩 시켜줘야 한다.
		String name2="홍길동";
		name2=URLEncoder.encode(name2,"UTF-8");//URL 인코딩 16진수 아스키코드 변경시켜줘야 한다. UTF-8 로 변경하는 것은 나중에 읽을때 UTF-8로 읽는다. 변환할때 복원할때 똑같은 문자쓰게 한다. 
		
		//쿠키를 응답헤더에 추가 
 		Cookie cookie2=new Cookie("name2",name2);
		response.addCookie(cookie1);//add는 계속 추가 set 은 변경시키는 것이다.
		response.addCookie(cookie2);//window 에서 show view 로 가서 other 가서 debug 로 가서 TCP/IP Monitor 을 눌러서 확인한다.
		//preference 를 들어가서 tcp /ip 를 설정해준다.
		cookie2.setMaxAge(30*24*60*60);
 		return "cookie/exam01";
	}
	/*
	@RequestMapping("/cookie/exam02")
	public String exam02(HttpServletRequest request,Model model) throws Exception{
		String name1=null;
		String name2=null;
		Cookie[]cookies=request.getCookies();
		for(Cookie cookie:cookies){
			if(cookie.getName().equals("name1")){
				name1=cookie.getValue();
				
			}else if(cookie.getName().equals("name2")){
				name2=cookie.getValue();//이상태는 encode 된 상태이다.
				name2=URLDecoder.decode(name2,"UTF-8");
			}
		}
		model.addAttribute("name1",name1);
		model.addAttribute("name2",name2);
		
		return "cookie/exam02";
	}*/
	

	@RequestMapping("/cookie/exam02")
	public String exam02(@CookieValue(defaultValue="") String name1,@CookieValue(defaultValue="") String name2,Model model) throws Exception{

		model.addAttribute("name1",name1);
		model.addAttribute("name2",name2);
		
		return "cookie/exam02";
	}
	
	@RequestMapping("/cookie/exam03")
	public String exam03(HttpServletResponse response){
		Cookie cookie1=new Cookie("name1","");//쿠기를 다시 보내주는 것이다. 
		Cookie cookie2=new Cookie("name2","");	
		
		//쿠키 삭제 
		cookie1.setMaxAge(0);
		cookie2.setMaxAge(0);
		
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		
		return "redirect:/";
		
		
	}
/*	@RequestMapping("/session/exam04")
	public String exam04(HttpSession session){//세션 객체를 만들면 저장이 된다.
		//세션에 문자열 정보를 저장
		session.setAttribute("name1", "hongkildong");
		session.setAttribute("name2", "홍길동");
		
		//세션에 객체를 저장
		Exam13Member member=new Exam13Member();
		member.setMname("스프링");
		session.setAttribute("member", member);//문자 뿐만 아니라 객체도 저장이 된다.
		
		return "redirect:/";
	}
	@RequestMapping("/session/exam05")//request response 가 오기전까지 사용이 가능하다. 세션은 동일 브라우저가 끊기기 전까지 사용이 가능하다.
	public String exam05(HttpSession session, Model model){
		String name1=(String)session.getAttribute("name1");
		String name2=(String)session.getAttribute("name2");
		Exam13Member member=(Exam13Member) session.getAttribute("member");
		LOGGER.info(name1);
		LOGGER.info(name2);
		LOGGER.info(member.getMname());
		
		model.addAttribute("name1",name1);
		model.addAttribute("name2",name2);
		
		return "session/exam05";
	}
	@RequestMapping("/session/exam06")
	public String exam06(HttpSession session){
		//session 에서 삭제해도 모델에 계속 남아 있을 수 있다.
		//@SessionAttributes 대신 HttpSession 만 이용할 경우에 사용
		session.removeAttribute("name1");
		session.removeAttribute("name2");
		session.removeAttribute("member");
		return "redirect:/";
		}*/
	//세선 httpsession 을 쓸거면 이것만 쓰고 session attribute 를 쓸 거면 httpsession을 쓰지말아라
		@RequestMapping("/session/exam04")//이것은 기본적은로 request 에 저장하는게 맞지만 세션에 저장해라 표시 할 수 도 있다.
	public String exam04(Model model){//보통은 객체를 사용하지 않는다.
			model.addAttribute("name1","hongkildong");
			model.addAttribute("name2","홍길동");
			Exam13Member member=new Exam13Member();
			member.setMname("스프링");
			model.addAttribute("member",member);
		return "redirect:/";
	}
	
	@RequestMapping("/session/exam05")//request response 가 오기전까지 사용이 가능하다. 세션은 동일 브라우저가 끊기기 전까지 사용이 가능하다.
	public String exam05(@ModelAttribute String name1,@ModelAttribute String name2,@ModelAttribute Exam13Member member ){
		//모델에 저장 되어 있는 Attribute 를 찾아와라 근데 위에 session 에 저장 하는 코드가 있어서 돌아간다.
		LOGGER.info(name1);
		LOGGER.info(name2);
		LOGGER.info(member.getMname());
		
	    //model.addAttribute("name1",name1);
			//model.addAttribute("name2",name2);
		return "session/exam05";
	}
	@RequestMapping("session/exam06")
	public String exam06(SessionStatus sessionStatus){
	sessionStatus.setComplete();
	return "redirect:/";
	}
	
}
	
