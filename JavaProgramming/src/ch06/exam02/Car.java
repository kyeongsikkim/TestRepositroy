package ch06.exam02;
//단순히 객체를 만들기 위한 설계도이다.
public class Car {
	//Field
	String company="현대자동차";//스트링 자체도 참조타입이다.  company 에는 String 객체를 가르키는 주소를 갖고 있는 것이다. 객체 안에 
	//객체 가 있는 것이 아니라 객체를 참조만 하는 것뿐이다.
	//객체의 필드는 데이터가 저장 되는 곳이지 항상 고정 된것은 아니다.어떤 값이 들어올지 모를 경우는 이대로 아닐경우는 값을 준다 항상.
	int speed;
	double speed0;
	String color;//객체를 생성할때 값을 항상 고정 시켜줄것이냐 아니면 나중에 객체를 만들고나서 해줄것인지가 중요하다.
	//이런형태로 정의되는 것이 필드이다.
	//constructor 객체를 만드는 역활 객체를 만들려면 생성자를 실행시켜야 된다. 생성자는 객체를 어떻게 만들어야 할까
	boolean airback;
	//String[]xx=new String[5];
	
	//오버로딩은 생성자를 여러개 생성할 수잇는것 메소드 이름을 똑같이 해서 여러개 생성이 가능한것
	//오버라이딩 은 상속과 관련이 있다.
	//생성자 여러개로 객체를 여러개 만들 수 있다.
	Car(){
		this("현대자동차",null,false);//객체는 자기 자신을 
	}
	public Car(String color,boolean airback){//생성자 오버로딩 옵션 두개를 넣어서 생성 할 수 있다. 
		this("현대자동차",color,airback);
	}//매개변수는 값을 전달 받으려고 
	Car(String company,String color,boolean airback){
		//생성자 오버로딩을 이용하기 위해서는 매개변수의 타입과 개수가 달라야 한다. 매개변수의 수가 다르거나 타입의 순서가 달라야한다. 타입이 달라야하거
/*	EX Car(String color,boolean airback)
 * 		Car(String company,boolean airback) 이런경우는 타입의 순서가 같고 갯수도 똑같기 때문에 안된다.
	EX Car(String color,boolean airback)
 * 		Car(boolean airback,String company)이런경우는 매개변수 갯수는 같지만 순서에 따른 타입이 달라서 상관없다.
	*/
		this.company=company;
		this.color=color;
		this.airback=airback;
	}
	void run(){
		System.out.println("현재"+speed+"km/h 로달립니다");
	}
}
//이것이 설계도의 모양이다.(설계도 구조는 필드 생성자 메소드)
//생성자든 메소드든 우선순위는 블록안에서는 매개변수가 우선순위가 된다.매개변수의 값을  매개변수에 대입을 하는 역활이 된다.
//this 는 현재 객체의 참조를 뜻하는 것이다. 나의 대입 칼라 
//매개변수와 필드와 이름을 같이 주는데 매개변수와 객체의 필드를 확실히 구분하기 위해서 this 를 넣어준다.
//중복된 코드를 줄이기 위한 방법
//this.점을 찍게 되면 내가 가지고 잇는것
//this() 는 나의 또다른 생성자를 호출해 달라 this ()는 나의 또다른 생성자를 호출해 달라
