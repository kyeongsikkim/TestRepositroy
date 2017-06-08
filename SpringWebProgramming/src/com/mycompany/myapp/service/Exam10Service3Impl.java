/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycompany.myapp.dao.Exam10Dao1;

@Component
public class Exam10Service3Impl implements Exam10Service3{
	
	
	private Exam10Dao1 exam10Dao;
	
	@Autowired
	public Exam10Service3Impl(Exam10Dao1 exam10Dao) {
		this.exam10Dao = exam10Dao;
	}	


	@Override
	public void join() {
		System.out.println("Exam10Service3Impl - join");
		exam10Dao.insert();
	}

	@Override
	public void login() {
		System.out.println("Exam10Service3Impl - login");
		exam10Dao.select();
	}
	
}
