package ch07.exam07;

public class Car {
	//필드 Tire 클래스가 public 라서 사용 할 수 있다.
	private Tire tire;//new tire(); 도 대입 가능하고 new NormalTire(); new SnowTire () 도 가능하다.
	
	//constructor
	public Car(Tire tire){
		this.tire=tire;
	}
	//method
	public void run(){
		tire.roll();//대입되는 객체에 따라서 roll 변환이 되는 것이다.
	}
	public void setTire(Tire tire) {
		this.tire = tire;
	}
}
