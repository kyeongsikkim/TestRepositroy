package ch06.exam08;

public class Calculator {
	//static ���� �����ڸ� ����ϸ� �ø��� ���� ��ü�� �����ȴ�.
	//singleton �� ������Ҵ� �޼ҵ� �޸� ������ ������ �Ǵ°��̴�.
	//final �� ���� �����ڿ��� �ѹ� �־��� �� �ִ�.
	//ū ������ ���� ������ 
	//static final  �� ����� �ȴ�. �̰��� �������� ����Ҽ��ְ� ���� �־� �ټ� �ִ�.
  private static Calculator singleton=new Calculator();//�����̺��� �ɸ��� ������ �� ���� ����. �����̺��� �Ȱɾ��ָ� �ܺο��� ������ �����ϴ�.
  //�޼ҵ尡 �ƴϱ� ������ ȣ�� �Ҷ����� ������ �Ǵ� ���� �ƴϴ�. �ѹ� ����� ���� singleton �ȿ� �ּҰ��� �����س��� ���̴�.
	private Calculator(){//�� �������ΰű� ������ �ܺο����� ȣ���� �� ���� ����private �� Ŭ������ ����� ��� �� �� ����.
	}
	static Calculator getInstance(){
		return singleton;
	}
}
