package ch06.exam04;

public class Tire {
	//Field
	String location;
	//Constructor
	Tire(String location){//생성자가 명시적으로 있으면 컴파일러는 생성자를 만들지 않는다.우리가 생성자를 만들면 컴파일러는 기본생성자를 만들지 않는다.
		this.location=location;
	}
	//method
	void roll(){
		System.out.println(location+"바퀴가 돌아감");
	}
	
}
