package ch07.exam01;

public class Child extends Parent{
//Field
	String firstName="�ڹ�";
//Constructor
	public Child(){
		super();//����� ����  super(); �̰� �ٴ´� �̰��� ���� �����ڸ� ������Ѷ� ���⼭ ����� ���� �θ�� ���� ����� �޾ұ� ������ �θ� ���� ������ ���Ѷ�
		//�θ��� ������ �߿��� �Ű������� ���� ���� ���� ���Ѷ� 
		//�ڽĻ����ڿ��� ���� ù��° ��ġ�ؾ� �Ѵ�. 
		System.out.println("Child ��ü ����");
	}
//Method
	void play(){
		System.out.println("��ƿ�");
	}
}
