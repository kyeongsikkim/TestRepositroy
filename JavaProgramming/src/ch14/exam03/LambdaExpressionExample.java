package ch14.exam03;

public class LambdaExpressionExample {
	public static int a=5;
	
	public static void main(String[] args) {//�͸�ü�� ���� ������ �ϴ� ���̴�.
		method1(()->{
			//a=9;�ʵ��� �������� �����ϴ�.
			System.out.println(a);//������ �Ѱ��̴�.
		});
		
		final int b=5;//������ ������ ������� �ȴ�. ���ξ����尡 ������� �������� �ȴ�. �ʵ� ������ ���� ���� ����� �����ϴ�. �����ϸ鼭 ���� �ٲٸ� �ȵȴ�.final �� �Ⱥپ� �־�� �پ��ִ°��̴�.
		//���� ������ ���ٽ� �ȿ��� ����Ҷ� �͸�ü �ȿ��� ����ϴ� �Ͱ� �Ȱ��� ������ ���� ������ �� ����.
		method1(()->{//�͸�ü 
			while(true){
			System.out.println(b);
			}
		});
	}
	public static void method1(FunctionalInterface1 i){
		i.method();
	} 
}

 
//���ٽ����� �ٲܼ� �ִ°��� �Լ��� �������̽� �׸��� �ݵ�� �߻�޼ҵ尡 �ϳ��� �־�� ���ٽ����� ������ �����ϴ�.