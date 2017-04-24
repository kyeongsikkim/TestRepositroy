package ch09.exam05;

public class Example {

	public static void main(String[] args) {
		//B b= new B();B는 A없이 사용을 할 수없다.중첩된 클래스는 단독으로 생성이 될수없다.
		A a=new A();
		A.B b=a.new B();//이런 경우는 드물다.A 클래스 안에 B 가 포함되어 있기 때문에 A를 먼저 만들어야한다.
		//A.B 는 A 안에 있는 B 를 접근한다. 
		A.C c=new A.C();//C는 static 가 붙어 있어서 A.C 로생성이 가능하다.
		//A.C 는 A 안에 있는 클래스 C 를 사용한다는 뜻이다.A 클래스 안에 선언된 B 클래스이구나.A.B
		//new 앞에 붙으면 a.new 이런 경우는 A 안에 B 가포함되어있는instance 필드 이다..
		//static 은 클래스 멤버 앞에만 붙을 수 있다. 로컬에는 못 붙인다. 필드와 메소드 앞에 붙이는 것은 가능 
		
	}

}
