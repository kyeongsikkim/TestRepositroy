package ch06.exam04;

public class Tire {
	//Field
	String location;
	//Constructor
	Tire(String location){//�����ڰ� ��������� ������ �����Ϸ��� �����ڸ� ������ �ʴ´�.�츮�� �����ڸ� ����� �����Ϸ��� �⺻�����ڸ� ������ �ʴ´�.
		this.location=location;
	}
	//method
	void roll(){
		System.out.println(location+"������ ���ư�");
	}
	
}
