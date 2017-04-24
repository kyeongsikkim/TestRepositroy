package ch09.exam01;

public class A {
	//field
	//constructor
	A(){
		//로컬 클래스
	class D{}//생성자 안에 클래스가 붙을 수 있다.
	class E{}//로컬 변수는 블록안에서 선언된 경우는 다른 블록에서도 선언이 되도 된다. 그래서 여기서 클래스 같은 이름 사용가능
	//생성자가 끝나면 사용을 못한다.
	}
	//method
	void method(){
	class D{}
	class E{}
	 //메소드 안에 생성자가 올수 있다.
	//메소드가 끝나게 되면은 사용을 못한다.좀처럼 이런 경우는 없다.
	}
	//nested class 중첩 멤버 클래스
	class B{}//A없이 B를 사용할 수없다. A가 없을 경우 B 가 필요가 없다.이런경우

	static class C{}//C 같은 경우는 A 에완전한 종속은 아니다 A와 밀접한 관련된 것이다.
	}

