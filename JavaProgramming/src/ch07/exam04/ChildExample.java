package ch07.exam04;

public class ChildExample {

	public static void main(String[] args) {
		Child child=new Child("��","�浿");//�ڽ��� �����ڸ� ���� �� ������ �ȿ� �θ��� �����ڸ� ����°� �����ִ�. ��ø� �����ָ� �˾Ƽ� ������ְ� ��ø� �ϸ��� 
		//�ڽ��� �����Ҷ� �θ��� �����ڰ� ���������. �θ��� ���带 �θ����ִ� ����� ����.
		System.out.println(child.lastName);
		System.out.println(child.firstName);
		child.sound();
		child.play();
	}

}
