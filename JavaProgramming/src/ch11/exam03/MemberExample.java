package ch11.exam03;

import java.util.HashSet;

public class MemberExample {

	public static void main(String[] args) {
		Member m1=new Member("blue");
		Member m2=new Member("blue");
		
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		//따라서 개별 객체는 해시 코드가 모두 다르다.
		HashSet hashSet=new HashSet();
		hashSet.add(m1);
		hashSet.add(m2);//내용이 같아도 해시코드가 다르면equals 를 검사안하고 바로 집어 넣는다. 해시코드가 같을 경우는 equals 를 확인해서 false 를 넣어줄 경우 새것으로 간주한다.
		System.out.println(hashSet.size());
	}

}
