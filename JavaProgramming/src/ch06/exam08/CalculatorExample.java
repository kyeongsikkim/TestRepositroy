package ch06.exam08;

public class CalculatorExample {
	public static void main(String[] args) {
			//new Calculator();//객체만 생성 하지만 사용할 수없다 어디에 생성된지 주소를 알 수없어서 외부에서는 사용을 할 수가 없다.
		Calculator calc1=Calculator.getInstance();//static 이 아니면 객체를 생성하고 불러야 하기 때문에 객체 생성안하고 부르기 위해서 
		Calculator calc2=Calculator.getInstance(); //한개의 번지 같은 번지만 계속해서 리턴하게 된다.
		
	}
}