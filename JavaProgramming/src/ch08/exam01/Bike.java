package ch08.exam01;

public class Bike implements Manual{//�����Ǵ� �� ���� ���� �� �� ����. �׷��� �������̽� �޼ҵ�� ����Ʈ�� public �� �ٱ� ������ Ŭ���������� �ٿ�����Ѵ�.
//Field
	private int speed;
	@Override
	public void turnOn() {
		System.out.println("���������Ÿ� �մϴ�");
	}

	@Override
	public void turnOff() {
		System.out.println("���������Ÿ� ���ϴ�");
	}

	@Override
	public void setSpeed(int speed) {
		System.out.println("�ӵ��� "+speed+"�� �����մϴ�");
		this.speed=speed;
	}

	@Override
	public int getSpeed() {
		return speed;
	}

	@Override
	public void run() {
		System.out.println("�ӵ��� "+speed+"�ӵ��� �޸��ϴ�.");
	}
	
	//Ŭ���������� ����Ʈ���� ������ �־ public �� �ٿ���� �Ѵ�.
}
