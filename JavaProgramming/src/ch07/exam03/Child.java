package ch07.exam03;

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
	@Override
		void sound() {
			// TODO Auto-generated method stub
			super.sound();
		}
	
	/*@Override
	void sound(){//�̷��� Ÿ���� ���� ���� ����. ����� ������ 
		System.out.println("����");
	}*/
	
	/*void sound( int i){
		
	}*/
	/*int sound(){ Ÿ���� �ٸ� �޼ҵ带 ���� �� ����.
	 * ������ ���� ���� Ÿ���� �Ȱ��ƾ� �Ѵ�.
	 * ���� �̸����� ��ȯŸ���� �ٸ����� ��� �Ҽ��� ����.
	 * ��ȯ Ÿ���� �ٸ��� �Ͽ� �޼ҵ� �̸��� ���� ���� �Ҽ� ����.
	 * �Ǽ��� ���ϱ� ���ؼ� ������ �Ȱ����� �ƴ��� �˼� �ִ� ��� 
	 * �������̵� �� �ٿ��� ������ �Ȱ����� �ƴ��� Ȯ�� �Ѵ�.
	 * @override
	 * void sounb(){//�����Ǹ� �ߴٰ� ������ �Ǽ��� �� �����ִ�. �׷��� ������ ������ �Ȱ����� Ȯ���ϴ� ���
	 * syso("����")
	}*/
}
