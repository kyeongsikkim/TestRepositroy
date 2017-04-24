package ch07.exam09;

public class CarExample {

	public static void main(String[] args) {
		//Car car=new Car(new NormalTire());
		Car car=new Car(new SnowTire());//이렇게 안해버리면 다형성이 안되는 것이다. 왜냐하면 new Car(new Tire)를 만들어 내면은 다형성이 안된다.
		Car car1=new Car(new NormalTire());
		car1.run();
	}
	//다형성 부품 교체와 밀접한 관계가 있다.
}
