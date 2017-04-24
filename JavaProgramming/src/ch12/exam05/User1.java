package ch12.exam05;

public class User1 extends Thread{
	//Field
	private Calculator calculator;
	//Constructor
	public User1(){
		super("User1"); //쓰레드 이름을 준것이다. setName 을 사용할 수도 있다.
	}
	//Method
	
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}


	@Override
	public void run() {
		calculator.setMemeory(100);
	}
}
