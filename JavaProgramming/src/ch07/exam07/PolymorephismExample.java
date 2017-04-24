package ch07.exam07;

public class PolymorephismExample {

	public static void main(String[] args) {
		Tire tire1=new Tire();
		
		NormalTire tire2=new NormalTire();
		SnowTire tire3=new SnowTire();
		
		run(tire1);
		run(tire2);//Tire tire=tire2;
		run(tire3);//Tire tire=tire3;
	}
	/*public 안쓰면 default 가 붙는 것이다 같은 패키지 안에서만 쓸 수 있다.*/
	static void run(Tire tire){
		tire.roll();//tire 의 rol ......noraml tire 의 롤 snow roll tire 의 롤 l
		
	}
	
}
