package ch09.exam03;

public class A {
	
	A(){
		 int localVariable=2;//로컬 변수가 로컬 클래스 에서 사용 할려면 1.7버전까지는 final 을 붙여야 한다.class 의 필드값으로 지정 된것은  중첩 클래스안의 메소드에서 사용이 불가하다.
		//localVariable=3; 이것은 메소드에서 사용하고 있기 때문에 값이 변경이 안된다.
		 //1.8 버전에서는 final 을 알아서 붙여준다.값을 변경을 못하는 이유는 final 특성을 갖기 때문에 값 변경이 불가하다
		//final int localVariable; 는 변수만 선언 한것이고 생성이 된것은 아니다.
		//로컬 클래스
		 //final 을 붙이면 메소드에 복사가 되고 안붙이면 class 필드에 복사가 된다. 복사가 되니까 값이 바뀌면 안된다.
	class D{//이것은 지역변수가 끝났다고 끝나는 것이 아니다. 그래서 final 이 붙어야 한다. 이것은 heap 영역에 생성이 된다.
		
		int resultl=localVariable;
		void dMethod(){
			int result=localVariable+8;
		}
	}
	}//로컬은 스택에 생성이 되지만 
}

//로컬 변수가 로컬 클래스 안에서 사용 될때는 final 특성을 가진다.
