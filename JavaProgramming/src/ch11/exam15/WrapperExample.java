package ch11.exam15;

public class WrapperExample {

	public static void main(String[] args) {
		int v1=10;
		Integer v2=10;//Integer �� Ŭ���� Ÿ���̴�. �ؼ��Ҷ��� 10�� ������ �ִ� integer �� ��ü�� �ڵ����� ������� �׹����� ������ �ȴ�.�ڽ�
		int v3=v2;//v2�� ������ �ִ� ���� ������ �����Ѵ� ��ڽ�
		method(3);//�̰���  object �� ���� �ɶ��� �ڽ��ؼ� integer �� ������ �ȴ����� obj �� ������ �ȴ�.
		int v4=method2();//�ڵ� ��ڽ��� �߻��ؼ� ������ ����������.
	}
	public static void method(Integer obj){//object obj 
		
	}
	public static Integer method2(){
		return 1;
	}
	

}
