package ch07.exam09;

public class Car {
	//�ʵ� Tire Ŭ������ public �� ��� �� �� �ִ�.
	private Tire tire;//new tire(); �� ���� �����ϰ� new NormalTire(); new SnowTire () �� �����ϴ�.
	
	//constructor
	public Car(Tire tire){
		this.tire=tire;
	}
	//method
	public void run(){//�ڽ� ��ü�� ������ ���ϱ� ������ �ڽ��� Ÿ���� Ȯ���ؼ� �ڽ��� �޼ҵ带 ȣ�� �� �� �ִ�.
		
		tire.roll();//���ԵǴ� ��ü�� ���� roll ��ȯ�� �Ǵ� ���̴�.
		/*if(tire instanceof SnowTire){
		}*/
		SnowTire snowTire=(SnowTire)tire;//Ÿ�� ��ȯ�� ���ؼ� ���� ����ȯ�� �ؼ� ������ �����ϴ�.
		snowTire.notSlide();

	}
	public void setTire(Tire tire) {
		this.tire = tire;
	}
}
