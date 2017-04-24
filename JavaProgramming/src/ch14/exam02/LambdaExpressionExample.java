package ch14.exam02;

public class LambdaExpressionExample {

	public static void main(String[] args) {//�͸�ü�� ���� ������ �ϴ� ���̴�.
		//////////////////�͸� ��ü ����/////////////////////////////////
		method1(new FunctionalInterface1(){//�� ��ü ���� ��� �Ƴ�?
			@Override
			public void method() {
				System.out.println("run...");
			}
		});
		//////////////////////////////////////////////////////////////////
		method1(()->{
			System.out.println("run...");
		});//�����϶��� �߰�ȣ�� ��� �ȴ�.
		method2((a)->{//�Ű����� �ϳ��� �޴´�.
			System.out.println(a+"run...");
			System.out.println(a+"run...");
		});
		
		method3((a,b)->{
			System.out.println(a+b);
		});
		method4((a,b)->{
			return a+b;
		});
		method4((a,b)->a+b);
	}
		
	//method2(a->sys(a+"run..")); �ϳ��϶��� �̷��� ����ص� �����ϴ�.
		/*method1(new FunctionalInterface1(){
		@Override
		public void method() {
			System.out.println("run...");
		
			}
		});
	}*/
	public static void method1(FunctionalInterface1 i){//�������̽��� �Ű������� �־ 
		i.method();
	}
	public static void method2(FunctionalInterface2 i){
		i.method(3);
	}
	
	public static void method3(FunctionalInterface3 i){
		i.method(3,5);
	}
	public static void method4(FunctionalInterface4 i){
		int result=i.method(3, 5);
		System.out.println("result"+result);
	}
}
