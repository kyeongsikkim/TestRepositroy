package ch07.exam01;

public class ChildExample {

	public static void main(String[] args) {
		Child child=new Child();//�̷��� ���� �� child ��ü����� ���� �ƴϸ�parent ��ü�� ����� ����? ����� �ް� �ִٸ� parent ��ü�� ������ �ȴ�.
		System.out.println(child.lastName);
		System.out.println(child.firstName);
		child.sound();
		child.play();
	}

}
