package ch07.exam09;

public class NormalTire extends Tire{
	//field
	//constructor
	NormalTire(){
		super();
		System.out.println("Nommal Tire 객체 생성 완성");
	}
	//method
	@Override
	void roll() {
		System.out.println("일반 타이어가 굴러갑니다.");
	}
}
