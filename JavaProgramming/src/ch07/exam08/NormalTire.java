package ch07.exam08;

public class NormalTire extends Tire{
	//field
	//constructor
	NormalTire(){
		super();
		System.out.println("Nommal Tire ��ü ���� �ϼ�");
	}
	//method
	@Override
	void roll() {
		System.out.println("�Ϲ� Ÿ�̾ �������ϴ�.");
	}
}
