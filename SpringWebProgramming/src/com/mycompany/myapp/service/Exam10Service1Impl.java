package com.mycompany.myapp.service;

import com.mycompany.myapp.dao.Exam10Dao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Exam10Service1Impl implements Exam10Service1{//이객체가 관리되고 있는 것이다.
	@Autowired
	private Exam10Dao1 exam10Dao;
	
	@Override
	public void join(){
		System.out.println("Exam10Service1Impl-xjoin() 실행 ! ");
		exam10Dao.insert();
	}
	
	@Override
	public void login(){
		System.out.println("Exam10Service1Impl-login() 실행 ! ");
		exam10Dao.select();
	}
}
