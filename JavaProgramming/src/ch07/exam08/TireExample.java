package ch07.exam08;

public class TireExample {

	public static void main(String[] args) {
		//Tire tire=new Tire();Tire 클래스가 추상 클래스라서 new로 객체를 만들 수 없다.
		Tire tire=new NormalTire();
		tire.roll();
		tire.xx();
	}

}
