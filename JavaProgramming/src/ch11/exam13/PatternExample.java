package ch11.exam13;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		String regExp="(02|010)-\\d{3,4}-\\d{4}";//역슬러시가 두개 들어가는 이유 역슬래시 t 역슬래시 n 이런것들은 문자열로 표현을 알고 싶을때 역슬러시를 하나 더붙여준다.하나의 문자로 받아들이겠다면 역슬러시를 붙여준다.
		String data="010-123-4567";
		
		boolean result=Pattern.matches(regExp,data);
		if(result){
			System.out.println("정규식과 일치합니다");
		}else{
			System.out.println("정규식과 일치하지 않습니다");
		}
		
		regExp="\\w+@\\w+\\.\\+(\\.\\w+)?";
		data="angel@naver.com";
		result=Pattern.matches(regExp, data);
		if(result){
			System.out.println("정규식과 일치합니다");
		}else{
			System.out.println("정규식과 일치하지 않습니다");
		}
	}

}
