package ch08.exam01;

public class ManualExample {
	public static void main(String[] args) {
		Manual manual=new Bike();//Manual 이라는 
		manual.turnOn();
		manual.setSpeed(10);
		manual.run();
		manual.turnOff();
		Manual manual1=new Car();//다형성에 쓴다.
		//move(new Bike()); 
		//move(new Car());
	}
	public static void move(Manual manual){
		
	}
	void xx(){
		move(new Car());
	}
	
}
