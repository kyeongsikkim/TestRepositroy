package ch06.exam06;

public class Calculator {
	String field1="value1";
	static String field2="value2";
	
	void method1(){
		//���� �ȿ� ����ƽ �ʵ带 ����� �� �� �� �ִ�. 
		System.out.println("method1()");
	}
	static void method2(){
		//���� �ȿ��ٰ� �ν��Ͻ� �ʵ带 ����ϰ� �Ǹ��� ��ü�� ������ �ʵ尡 ������ �ǰ� �ȴ�. 
		//static �� ����� �ϰ� �Ǹ��� ��ü �������� ������ ���������� ���� �ȿ� �ν��Ͻ� �ʵ尡 ���� �Ǹ��� ��ü�� �־�� ������ ����������
		//�׷��� ���� ���� static �� ���̸� �ȴ� �� �ν��Ͻ� �ʵ尡 ���� �ʴ� �޼ҵ�� static �� ���δ�.
		System.out.println("method2()");
	}
}
