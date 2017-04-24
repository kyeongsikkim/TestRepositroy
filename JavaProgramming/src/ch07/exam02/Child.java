package ch07.exam02;

public class Child extends Parent{
//Field 필드나 메소드나 생성자의 위치는 중요하지 않다.
	String firstName;
//Constructor
	Child(String lastName,String firstName){
		super(lastName);
		//super("김")//부모 클래스에서는 매개변수가 있는 생성자를 만들었으면 안에 값을 넣어줘야 한다.그렇기 때문에 여기에서도 값을 넣어줘야 한다.
		//super 를 안적어줘도 컴파일러는 알아서 기본 super 파일을 만들어 준다.
	this.firstName=firstName;
	}
//Method
	void play(){
		System.out.println("놀아요");
	}
}
