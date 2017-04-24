package ch15.exam02;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListExample {

	public static void main(String[] args) {
		List<String>list=Arrays.asList("홍길동","신용권","감자바");//꼭 세개만 써야 된다.테스트 해야 된다.배열하고 똑같다.
		for(String str:list){
			
			System.out.println(str);
		}
		//list.add("NEW");지원하지 않는다. 추가가 되지 않는다 Arrays.asList 는 길이 부분의 조정이 되지 않는다. 배열의 성격이 강하다.
		List<Integer>list2=Arrays.asList(1,2,3);//List 는 기본 타입이 안들어가고 객체 타입만 들어갈수있다.
		for(int Int:list2){
			System.out.println(Int);
		}
		
	}

}
//벡터는 동기화가 되어있다. arrayList 가 공유객체가 된다.
//list new vector 
//