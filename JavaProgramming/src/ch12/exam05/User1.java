package ch12.exam05;

public class User1 extends Thread{
	//Field
	private Calculator calculator;
	//Constructor
	public User1(){
		super("User1"); //������ �̸��� �ذ��̴�. setName �� ����� ���� �ִ�.
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
