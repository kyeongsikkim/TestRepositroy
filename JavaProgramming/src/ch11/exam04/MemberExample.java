package ch11.exam04;

import java.util.HashSet;

public class MemberExample {

	public static void main(String[] args) {
		Member m1=new Member("blue");
		System.out.println(m1.toString());//object 가 갖고 있는 toString();
		System.out.println(m1);//이럴경우 .toString 를 자동으로 호출하게 된다.
		String result=m1+"good";//문자일때는 문자결합을 한다. 
		System.out.println(result);
	}

}
