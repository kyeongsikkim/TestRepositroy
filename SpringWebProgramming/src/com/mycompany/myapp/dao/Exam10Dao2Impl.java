package com.mycompany.myapp.dao;

public class Exam10Dao2Impl implements Exam10Dao2{
	
	@Override
	public void insert(){
		System.out.println("insert() 실행 ! ");
	}
	
	@Override
	public void select(){
		System.out.println("select() 실행 ! ");
	}
}
