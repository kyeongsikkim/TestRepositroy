package ch07.exam09;

public class CarExample {

	public static void main(String[] args) {
		//Car car=new Car(new NormalTire());
		Car car=new Car(new SnowTire());//�̷��� ���ع����� �������� �ȵǴ� ���̴�. �ֳ��ϸ� new Car(new Tire)�� ����� ������ �������� �ȵȴ�.
		Car car1=new Car(new NormalTire());
		car1.run();
	}
	//������ ��ǰ ��ü�� ������ ���谡 �ִ�.
}
