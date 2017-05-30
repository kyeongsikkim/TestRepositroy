package com.mycompany.myapp.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.mycompany.myapp.dao.Exam10Dao3;

@Component()
public class Exam10Service6Impl implements Exam10Service6{//이객체가 관리되고 있는 것이다.

	//@Autowired//오토와이어드는 오로지 타입만 보고 집어 넣는다. 타입만 있으면 집어 넣는다 . 타입이 두개가 있으면 어떤 객체를 넣는지 모른다.
	@Resource(name="exam10Dao3ImplA")//들어가는 기본속성이 있다.특정 구현객체를 집어 넣을 수 있다. 스프링이 제공하는게 아니라 자바에서 제공해주는 것이다.
	private Exam10Dao3 exam10Dao;

	@Override
	public void join(){
		System.out.println("Exam10Service2Impl-join() 실행 ! ");
		exam10Dao.insert();
	}
	
	
	@Override	
	public void login(){
		System.out.println("Exam10Service2Impl-login() 실행 ! ");
		exam10Dao.select();
	}
}
