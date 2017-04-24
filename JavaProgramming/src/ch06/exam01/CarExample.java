package ch06.exam01;
//하나의 프로젝트안에서는 하나의 실행파일인 메소드만 있으면 된다.이렇게 하지 않고 보통은 프로젝트 안에 메인하나만 만든다.
public class CarExample {

	public static void main(String[] args) {
	 //new Car();//이렇게 하면은 heap 영역에 생성은 되었지만 위치가 어디있는지 모른다. 그래서 사용을 할 수가 없는 것이된다. 그렇기 때문에 어디에 저장 되어있는지 알려줘
	 //야 된다. 생성을 하면서 생성자 안에 있는 것을 실행을 한다.
		Car myCar=new Car(); //카 타입으로 mycar 변수명을 만들고서 new Car로 객체를 만들어서 위치 정보를 알려주겠다.객체 하나 생성한것이다.
		//.객체로 접근해서 객체가 가지고 있는 기능을 사용할수있다. 객체 접근자 
		Car yourCar=new Car();//하나의 참조변수는 두가지의 객체를 나타낼수없다. 그래서 같은 변수명을 가질 수 없다.
		//객체 메소드 호출
		myCar.run();
		System.out.println(myCar.company);
		System.out.println(myCar.speed);//객체가 생성이 되면서 필드는 자동으로 초기화 가 된다.
		
		//변수는 선언하구서 값을 넣어주지 않으면 생성이 안된다.
		System.out.println(myCar.color);
		System.out.println(myCar.airback);
		System.out.println(myCar.xx[0]);
		
		myCar.speed=30;
		myCar.color="흰색";
		myCar.run();
		System.out.println(myCar.speed);//객체가 생성이 되면서 필드는 자동으로 초기화 가 된다.
		//변수는 선언하구서 값을 넣어주지 않으면 생성이 안된다.
		System.out.println(myCar.color);
	}
//객체를 만들기 위해서는 생성자 반드시 있어야 한다. 
}
