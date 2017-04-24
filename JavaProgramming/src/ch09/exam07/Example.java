package ch09.exam07;


public class Example {//A클래스 안에 있는B로 구현이 가능하다.

	public static void main(String[]args){
	
		/*
		//로컬 클래스를 정의하고 객체 생성
		class B2 extends A.B{
		 @Override
			void bMethod() {
				 System.out.println("B2의 Method 이다");
			}
		 }
		A.B b=new B2();//static 가 붙어서 사용이 가능한것이다.
		 	b.bMethod();//항상 재정의 된것이 나온다.
			
			 B2 b2=new B2();
			 b2.bMethod();*/
			 
			A.B b=new A.B(){//익명 객체를 생성한다. 중첩 클래스이다.
			 @Override
			void bMethod() {
				 System.out.println("B2의 Method 이다");
			 }
		 };
		 b.bMethod();
		 	
		 //괄호의 중가로 객체를 만드는데 B라는 놈을 상속을 해서 상속하고나서 자식을 만든 다음에 
		 //자식에서 정의할 내용을 {}에 정의하고나서   자식의 객체를 만든다.근데 자식의 이름은 없어서 익명객체라고 한다.생성되는 것은 위에서 B2랑 똑같다.
	 }

	 }


