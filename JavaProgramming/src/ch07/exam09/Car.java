package ch07.exam09;

public class Car {
	//필드 Tire 클래스가 public 라서 사용 할 수 있다.
	private Tire tire;//new tire(); 도 대입 가능하고 new NormalTire(); new SnowTire () 도 가능하다.
	
	//constructor
	public Car(Tire tire){
		this.tire=tire;
	}
	//method
	public void run(){//자식 객체를 접근을 못하기 때문에 자식의 타입을 확인해서 자식의 메소드를 호출 할 수 있다.
		
		tire.roll();//대입되는 객체에 따라서 roll 변환이 되는 것이다.
		/*if(tire instanceof SnowTire){
		}*/
		SnowTire snowTire=(SnowTire)tire;//타입 변환을 통해서 강제 형변환을 해서 접근이 가능하다.
		snowTire.notSlide();

	}
	public void setTire(Tire tire) {
		this.tire = tire;
	}
}
