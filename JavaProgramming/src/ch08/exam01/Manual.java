package ch08.exam01;

public interface Manual {//public �پ� �ְ� �Ⱥپ� �ְ�� �Ȱ���. �ᱹ�� �� public �̴�.
//field
	/*public static final:�⺻������ �پ� �ִ�. */
	String COMPANY="�Ｚ����";
	int MAX_SPEED=10;
	int MIN_SPEED=10;
//method �������̽��� ����� �� �ִ� ��ü �������̽��� ������ ��ü �������̽��� ��� ������ ��ü�� �ִµ� �ּ��� �������̽��� �ִ� ������ ������ �־���Ѵ�.
	//�������̽��� ������ ��ü
	/*public abstract:�޼ҵ�� �⺻������ �پ��ִ�.*/
	void turnOn();//���ϰ� ����.�Ű�������.
	void turnOff();//���ϰ� ����. �Ű�������.
	void setSpeed(int speed);//�Ű� ���� �ִ�.
	int getSpeed();//�Ű��� ���� ���ϰ� �ִ�.���� 
	void run();//�Ű�������  ���ϰ� ����// �������̽��� ����Ʈ�� �ۺ��� �׻� �ٴ´�. 
//interface �� �����ڸ� �Ȱ��´�.
}
