package ch06.exam06;

public class CalculatorExample {

	public static void main(String[] args) {
		System.out.println(Calculator.field2);//�޼ҵ� ������ �ִ� ���� ����ϴ� ���̴�.
		Calculator.method2();
		
		Calculator calc=new Calculator();
		System.out.println(calc.field2);//�̷��� �ȴٰ� �ص� Ŭ���� �ȿ� �ִ� ������ ��ü �ȿ� �ִ� ���� �ƴϴ�.
		calc.method1();
		//static ��� ���� ���� 
		//�޼ҵ� ������ �� �ִ�. ��ü�� �ȸ���� �޼ҵ常 ����� �Ҷ� �ν��Ͻ� �ʵ带 �̿��ؾ� �Ѵٸ� static �� �� �� ����.
		//�ν��Ͻ��� �ʵ尡 �Ⱦ��̴� ���� �ʵ�
	}

}
