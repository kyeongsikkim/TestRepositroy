package ch07.exam02;

public class Child extends Parent{
//Field �ʵ峪 �޼ҵ峪 �������� ��ġ�� �߿����� �ʴ�.
	String firstName;
//Constructor
	Child(String lastName,String firstName){
		super(lastName);
		//super("��")//�θ� Ŭ���������� �Ű������� �ִ� �����ڸ� ��������� �ȿ� ���� �־���� �Ѵ�.�׷��� ������ ���⿡���� ���� �־���� �Ѵ�.
		//super �� �������൵ �����Ϸ��� �˾Ƽ� �⺻ super ������ ����� �ش�.
	this.firstName=firstName;
	}
//Method
	void play(){
		System.out.println("��ƿ�");
	}
}
