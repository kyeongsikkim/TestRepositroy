package com.mycompany.myapp.dao.sub;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.mycompany.myapp.dao.Exam10Dao3;

@Component("subExam10Dao3ImplA")//스프링이 보통 관리를 할때는 클래스 이름으로 관리를 하게 된다.component 에서 이름을 정의 해 줄 수 있다.
public class Exam10Dao3ImplA implements Exam10Dao3{
	//상수는 다 대문자로 쓴다.
	private static final Logger LOGGER=LoggerFactory.getLogger(Exam10Dao3ImplA.class);
	@Override
	public void insert(){
		LOGGER.info("회원 가입 처리");
	}
	
	@Override
	public void select(){
		LOGGER.info("회원 검색");
	}
}
