package com.mycompany.myapp.service;

import com.mycompany.myapp.dao.Exam10Dao2;


public class Exam10Service5Impl implements Exam10Service4{//이객체가 관리되고 있는 것이다.

	
	private Exam10Dao2 exam10Dao;	//주입이 될려면 setter 로 받아야 한다 외부에서 	
	public void setExam10Dao(Exam10Dao2 exam10Dao) {
		this.exam10Dao = exam10Dao;
	}


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
