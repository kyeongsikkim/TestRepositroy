package ch09.exam07;


public class Example {//AŬ���� �ȿ� �ִ�B�� ������ �����ϴ�.

	public static void main(String[]args){
	
		/*
		//���� Ŭ������ �����ϰ� ��ü ����
		class B2 extends A.B{
		 @Override
			void bMethod() {
				 System.out.println("B2�� Method �̴�");
			}
		 }
		A.B b=new B2();//static �� �پ ����� �����Ѱ��̴�.
		 	b.bMethod();//�׻� ������ �Ȱ��� ���´�.
			
			 B2 b2=new B2();
			 b2.bMethod();*/
			 
			A.B b=new A.B(){//�͸� ��ü�� �����Ѵ�. ��ø Ŭ�����̴�.
			 @Override
			void bMethod() {
				 System.out.println("B2�� Method �̴�");
			 }
		 };
		 b.bMethod();
		 	
		 //��ȣ�� �߰��� ��ü�� ����µ� B��� ���� ����� �ؼ� ����ϰ��� �ڽ��� ���� ������ 
		 //�ڽĿ��� ������ ������ {}�� �����ϰ���   �ڽ��� ��ü�� �����.�ٵ� �ڽ��� �̸��� ��� �͸�ü��� �Ѵ�.�����Ǵ� ���� ������ B2�� �Ȱ���.
	 }

	 }


