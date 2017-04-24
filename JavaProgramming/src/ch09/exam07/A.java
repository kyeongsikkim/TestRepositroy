package ch09.exam07;

public class A {
	//Field
	//constructor
	//method
	
	//nested class
	static class B{//static 를 안붙이고 상속을 할 수 없는 관계가 된다. 왜냐하면 A가 생성이 안되는 B를 사용을 할 수가 없다. B를 상속하기 위해서는 static 가 붙어야한다.
		void bMethod(){
			
		}
	}
	
	//nested interface
	interface C{
	void cMethod();
	
	}
}
