package ch08.exam01;

public class ManualExample {
	public static void main(String[] args) {
		Manual manual=new Bike();//Manual �̶�� 
		manual.turnOn();
		manual.setSpeed(10);
		manual.run();
		manual.turnOff();
		Manual manual1=new Car();//�������� ����.
		//move(new Bike()); 
		//move(new Car());
	}
	public static void move(Manual manual){
		
	}
	void xx(){
		move(new Car());
	}
	
}
