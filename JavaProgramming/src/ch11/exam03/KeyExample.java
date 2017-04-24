package ch11.exam03;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		HashMap hashMap=new HashMap();
		
		Key k1=new Key(10);
		Member m1=new Member("blue");
		hashMap.put(k1, m1);
		
		Key k2=new Key(10);
		Member m2=new Member("blue");
		hashMap.put(k2, m2);
		System.out.println(hashMap.size());//사이즈가 2가 나온다 key 의 해시 코드가 다르다 키값을 비교할때는 
	}

}


//hash set 은 순서없이 객체를 저장 하는 것을 말한다.
//hashmap 은 키값으로 값을 관리한다. hash map 은 키값을 비교를 한다. 해시코드를 비교하고 equals 를 통해서 비교를 한다.