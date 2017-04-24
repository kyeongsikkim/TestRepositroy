package ch06.exam06;

public class Calculator {
	String field1="value1";
	static String field2="value2";
	
	void method1(){
		//여기 안에 스태틱 필드를 사용을 할 수 는 있다. 
		System.out.println("method1()");
	}
	static void method2(){
		//여기 안에다가 인스턴스 필드를 사용하게 되면은 객체를 만들어야 필드가 생성이 되게 된다. 
		//static 을 사용을 하게 되면은 객체 생성없이 접근이 가능하지만 여기 안에 인스턴스 필드가 들어가게 되면은 객체가 있어야 접근이 가능하지만
		//그렇지 않을 경우는 static 를 붙이면 된다 즉 인스턴스 필드가 들어가지 않는 메소드는 static 를 붙인다.
		System.out.println("method2()");
	}
}
