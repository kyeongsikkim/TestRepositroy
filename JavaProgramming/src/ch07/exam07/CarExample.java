package ch07.exam07;

public class CarExample {

	public static void main(String[] args) {
		//Car car=new Car(new NormalTire());
		Car car=new Car(new SnowTire());
		car.run();
		
		car.setTire(new NormalTire());
		car.run();
		
		car.setTire(new SpeedTire());
		car.run();
		
		car.setTire(new SuperTire());
		car.run();
	}
	//다형성 부품 교체와 밀접한 관계가 있다.
}
