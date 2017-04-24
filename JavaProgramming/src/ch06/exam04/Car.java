package ch06.exam04;

public class Car {
//Field 가 될 수 있는것은 해당객체 뿐만 아니라 객체의 구성품도 필드로 선언할 수있다.Car 라고 하는 차제에 필드가 생성이 되고 
	Body body=new Body();//카안에 body 객체가 만들어지는 것은 아니다. Car는 단순히 참조하는 것이다.
	Engine engine=new Engine();
	Dashboard dashboard=new Dashboard();
	//Seat []seat=new Seat[4];//seat 객체를 담을 배열을 만든것
	Seat[]seat1={new Seat(),new Seat(),new Seat(),new Seat()};//배열안에 4개의 객체를 집어 넣어준다.
	Tire[]tires={new Tire("앞우"),new Tire("앞좌"),new Tire("뒤우"),new Tire("뒤좌")};//객체를 생성해서 그것을 가르키는 주소를 알려주면 된다.
	String makeDay;
	String color;//객체가 만들어지면 반드시 있어야 한다.
	int speed;//상태데이터 수시로 값이 바뀐다.
	
//constructor
	Car(String makeDay,String color){
		this.makeDay=makeDay;
		this.color=color;
	}
//method
	void start(){
		engine.start();
	}
	void run(){
		tires[0].roll();//자신 객체 안에 필드로 있기 때문에 따로 참조를 안하고 바로 쓸수 있다.
		tires[1].roll();
		tires[2].roll();
		tires[3].roll();
		setSpeed(60);//객체 안에서 자기 함수를 호출 할때는 참조 변수가 필요 없다.자기자신안에서 메소드를 호출 하는 것이다. 메소드를 호출 할때는 변수를 통해서 접근을 하지만 
		//메소드 안에서 호출을 할때는 참조 할 필요 없이 가능하다.
		dashboard.display(60);
	}
	void setSpeed(int speed){
		this.speed=speed;
	}
	void stop(){
		engine.stop();
		speed=0;
	}
}
