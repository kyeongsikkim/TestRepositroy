package ch06.exam03;

//import ch06.exam02.Car;//import 는 패키지랑 클래스로 순서대로 이루어진다.패키지는 소문자 클래스는 대문자
//import 는 가지고 와라 ch06.exam02.car 를 가지고 아서 써라 외부에 존재하는 설계도를 가지고 올때 사용 할 수 있게 
//같은 패키지 안에 있는 경우는 import 필요 없다.
public class Calculator {
	//필드

	//생성자
	//메소드
	//메소드 첫자는 소문자로 하는게 관례 클래스명은 대문자 패키지는 소문자
	void powerOn(){
	 System.out.println("전원을 켭니다");
	}
	void powerOff(){
		System.out.println("전원을 끕니다");
	}

	String info(){
		return "삼성전자-2017-03.28"; 
	}
	int plus(int x,int y){//반환 타입은 다 올 수 있다.//메소드 선언
		int result=x+y;
		return result;
	}
	//메소드 오버로딩 과 리턴 타입은 관련이 없다.오버로딩은 매개 변수에 차이가 있다.
	//오버로딩은 생성자와 메소드에 생기는데 똑같은 이름 이라도 매개변수가 다르기 면 사용 할 수 있다.
	double plus(double x,double y){//반환 타입은 다 올 수 있다.//메소드 선언
		double result=x+y;
		return result;
	}
	double divide(double x,double y){
		double result=x/y;
		return result;
	}
	int[]changeArray(int x,int y,int z){
		int []array={x,y,z};
		return array;
	}
	//car 라는 클래스를 어디서 찾아서 하냐 
	Car makeCar(String color,boolean airback){
		//new Car(color,airback);객체는 생성을 하지만 객체를 가르키는 주소가 없어서 쓰레기 객체가 된다.
		Car car=new Car(color,airback);
		return car;//car 의 주소 값을 넘겨주는 것이다. 타입에 맞게 리턴을 해줘야 한다.
	}

}
//참조 변수는 다 null 인된다.
