package ch12.exam05;

public class User2 extends Thread{
	//Field
	private Calculator calculator;
	//Constructor
	public User2(){
		super("User2"); //������ �̸��� �ذ��̴�. setName �� ����� ���� �ִ�.
	}
	//Method
	
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}


	@Override
	public void run() {
		calculator.setMemeory(50);
	}
}
