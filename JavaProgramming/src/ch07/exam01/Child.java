package ch07.exam01;

public class Child extends Parent{
//Field
	String firstName="자바";
//Constructor
	public Child(){
		super();//상속이 들어가면  super(); 이게 붙는다 이것은 위의 생성자를 실행시켜라 여기서 위라는 것은 부모로 부터 상속을 받았기 때문에 부모 부터 실행을 시켜라
		//부모의 생성자 중에서 매개변수가 없는 것을 실행 시켜라 
		//자식생성자에서 가장 첫번째 위치해야 한다. 
		System.out.println("Child 객체 생성");
	}
//Method
	void play(){
		System.out.println("놀아요");
	}
}
