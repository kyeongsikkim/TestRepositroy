package com.mycompany.myapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycompany.myapp.dao.Exam10Dao1;

@Component
public class Exam10Service3Impl implements Exam10Service3{//이객체가 관리되고 있는 것이다.

	
	private Exam10Dao1 exam10Dao;	
	
	@Autowired	//생성자 주입 이다. service 를 객체구현을 생성할때 의존성 주입을 만들어 준다.
	public Exam10Service3Impl(Exam10Dao1 exam10Dao){
		this.exam10Dao=exam10Dao;
		//추가적인 코드가 가능하다.
	}

	@Override
	public void join(){
		System.out.println("Exam10Service3Impl-join() 실행 ! ");
		exam10Dao.insert();
	}
	
	
	@Override	
	public void login(){
		System.out.println("Exam10Service23mpl-login() 실행 ! ");
		exam10Dao.select();
	}
}
