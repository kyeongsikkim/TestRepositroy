package ch07.exam09;

public abstract class Tire {
	//field
	//constructor
	Tire(){
		
	}
	//method
	abstract void roll();
	
	void xx(){
		System.out.println("yy");
	}
	//추상 클래스라도 필드 생성자 메소드 다가질 수 있다. 추상클래스는 추상 메소드를 더 가질 수 있다.
}
