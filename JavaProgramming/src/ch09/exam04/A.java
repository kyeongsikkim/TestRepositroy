package ch09.exam04;

public class A {
//Field
		int field;
	//constructor
	//Method
		//중첩 클래스이다.
	class B{//static  가 안붙었기 때문에 A객체가 생성이 되어야 B를 사용 할 수 있다.
	//field
	//constructor
	//Method
	int field;
	
	void method(){
		field=10;//가장 가까운 곳을 찾아간다.
		A.this.field=10;//이것은 A필드이다. 
	}
	}
	
	}

