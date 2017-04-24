package ch06.exam01;
//단순히 객체를 만들기 위한 설계도이다.
public class Car {
	//Field
	String company="현대자동차";
	//객체의 필드는 데이터가 저장 되는 곳이지 항상 고정 된것은 아니다.어떤 값이 들어올지 모를 경우는 이대로 아닐경우는 값을 준다 항상.
	int speed;
	double speed0;
	String color;//객체를 생성할때 값을 항상 고정 시켜줄것이냐 아니면 나중에 객체를 만들고나서 해줄것인지가 중요하다.
	//이런형태로 정의되는 것이 필드이다.
	//constructor 객체를 만드는 역활 객체를 만들려면 생성자를 실행시켜야 된다. 생성자는 객체를 어떻게 만들어야 할까
	boolean airback;
	String[]xx=new String[5];
	
	/*Car(){
		System.out.println("Car 객체생성");
		//....여기 안 내용이 다 실행이 되어야 객체가 만들어진다.
	};컴파일러가 직접 넣어준다.생성자를 직접 만들어 주지 않아도 되기는 하지만 실질적으로는 생성자가 필요는 하다. 컴파일을 javac 를 통해서
	해준다음에 생기는 파일은.class 파일이다/ class 파일을 확인해보면 설계에 직접 코드로 작성을 안해도 생성 된것을 확인 할 수 있다.
	확인 해보면 */
	//Method:객체가 만들어지는 기능 
	void run(){
		System.out.println("현재"+speed+"km/h 로달립니다");
	}
}
//이것이 설계도의 모양이다.
