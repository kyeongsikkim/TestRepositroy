package ch07.exam07;

public class Car {
	//�ʵ� Tire Ŭ������ public �� ��� �� �� �ִ�.
	private Tire tire;//new tire(); �� ���� �����ϰ� new NormalTire(); new SnowTire () �� �����ϴ�.
	
	//constructor
	public Car(Tire tire){
		this.tire=tire;
	}
	//method
	public void run(){
		tire.roll();//���ԵǴ� ��ü�� ���� roll ��ȯ�� �Ǵ� ���̴�.
	}
	public void setTire(Tire tire) {
		this.tire = tire;
	}
}
