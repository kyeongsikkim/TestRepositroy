package ch08.exam01;

public class Bike implements Manual{//재정의는 더 좁게 정의 할 수 없다. 그래서 인터페이스 메소드는 디폴트로 public 이 붙기 때문에 클래스에서는 붙여줘야한다.
//Field
	private int speed;
	@Override
	public void turnOn() {
		System.out.println("전동자전거를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("전동자전거를 끕니다");
	}

	@Override
	public void setSpeed(int speed) {
		System.out.println("속도를 "+speed+"로 변경합니다");
		this.speed=speed;
	}

	@Override
	public int getSpeed() {
		return speed;
	}

	@Override
	public void run() {
		System.out.println("속도를 "+speed+"속도로 달립니다.");
	}
	
	//클래스에서는 디폴트값을 가지고 있어서 public 을 붙여줘야 한다.
}
