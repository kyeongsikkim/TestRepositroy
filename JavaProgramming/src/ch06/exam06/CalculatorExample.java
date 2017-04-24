package ch06.exam06;

public class CalculatorExample {

	public static void main(String[] args) {
		System.out.println(Calculator.field2);//메소드 영역에 있는 것을 사용하는 것이다.
		Calculator.method2();
		
		Calculator calc=new Calculator();
		System.out.println(calc.field2);//이렇게 된다고 해도 클래스 안에 있는 것이지 객체 안에 있는 것은 아니다.
		calc.method1();
		//static 상수 같은 경우는 
		//메소드 영역에 다 있다. 객체를 안만들고 메소드만 사용을 할때 인스턴스 필드를 이용해야 한다면 static 이 될 수 없다.
		//인스턴스가 필드가 안쓰이는 것은 필드
	}

}
