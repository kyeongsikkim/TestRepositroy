package ch06.exam04;

public class CarExample {

	public static void main(String[] args) {
		Car myCar=new Car("2017-03-28","검정");
		//Engine의 메소드 호출 
		myCar.engine.start();
		
		//Dashboard 의 메소드 호출
		myCar.dashboard.display(60);
		
		//Tire의 필드값 일기 
		System.out.println(myCar.tires[0].location);
		
		myCar.tires[2].roll();
		//car의 메소드 호출
		myCar.start();
		
		myCar.run();
		//---------------------------------------------
		//tire(앞좌 )부품교체 
		myCar.tires[1]=new Tire("새앞좌");//객체를 변경시키는 것이다.
		myCar.run();
	}

}
