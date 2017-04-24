package ch06.exam02;
//하나의 프로젝트안에서는 하나의 실행파일인 메소드만 있으면 된다.이렇게 하지 않고 보통은 프로젝트 안에 메인하나만 만든다.
public class CarExample {

	public static void main(String[] args) {
	 //new Car();//이렇게 하면은 heap 영역에 생성은 되었지만 위치가 어디있는지 모른다. 그래서 사용을 할 수가 없는 것이된다. 그렇기 때문에 어디에 저장 되어있는지 알려줘
	 //야 된다. 생성을 하면서 생성자 안에 있는 것을 실행을 한다.
		Car myCar=new Car(); //카 타입으로 mycar 변수명을 만들고서 new Car로 객체를 만들어서 위치 정보를 알려주겠다.객체 하나 생성한것이다.
		System.out.println(myCar.company);
		System.out.println(myCar.speed);
		System.out.println(myCar.color);
		System.out.println(myCar.airback);
		
		Car yourCar=new Car("검정",true);
		System.out.println(myCar.company);
		System.out.println(myCar.speed);
		System.out.println(myCar.color);
		System.out.println(myCar.airback);
		
		yourCar=new Car("빨강",false);
		System.out.println(yourCar.company);
		System.out.println(myCar.speed);
		System.out.println(myCar.color);
		System.out.println(myCar.airback);
	}
//객체를 만들기 위해서는 생성자 반드시 있어야 한다. 모든 객체를 지우기 위해서는 null을 넣어줘서 없애 준다. 그러면 주소를 못찾게 되어서 쓰레기 객체가 된다.
}
