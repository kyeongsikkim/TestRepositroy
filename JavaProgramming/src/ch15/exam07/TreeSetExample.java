package ch15.exam07;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		//Set<Integer>set=new TreeSet<Integer>();//부모에게 선언된것만 사용가능하다. set interface 재정의 한것이다. 다형성 재정의 된것을 사용할 수 있다.comparable
		TreeSet<Person>set=new TreeSet<Person>();//Collections.reverseOrder() 큰게 먼저저장이 된다.ㅇㅋㅇㅋㅇㅋㅇ
		//treeset 은 비교를 해야 입력을 한다.treeset 은 외부에서 비교자를 제공해줘야 한다. 
		set.add(new Person("홍길동",45));
		set.add(new Person("감자바",25));
		set.add(new Person("박지원",31));

		
		for(Person p:set){//올림차순 자체가된다. 
			System.out.println(p.getName()+p.getAge());
		}
	}

}
/*
 *comparable 은 비교기능이 있는 객체  
 */
