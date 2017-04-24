package ch06.exam11.pack1;

public class B {
	A a=new A();//같은 패키지 안에 있는 클래스는 사용을 할 수 있다.
	
	void method(){
		a.field1=10;
		a.method();
	}
}
