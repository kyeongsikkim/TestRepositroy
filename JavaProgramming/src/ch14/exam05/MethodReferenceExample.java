package ch14.exam05;

public class MethodReferenceExample {

	public static void main(String[] args) {
	method1(new FunctionalInterface1() {
		@Override
		public boolean method(String a, String b) {
			return a.equals(b);
		}
	});
	method1((a,b)->{return a.equals(b);});
	method1((a,b)->a.equals(b));
	//�ΰ��� �Ű� ���� �ϳ��� ������ ���� �Ѵ�.
	method1(String::equals);//equals ���ν��Ͻ� �޼ҵ��δ�
	//a.equals(b)�� �ؼ��� �ؾ� �ȴ�. static �� �޼ҵ� �ϰ��� 
	//�ΰ��� �Ű������� ���� �ȴ�. �ν��Ͻ� �޼ҵ�� a.�޼ҵ�b �� �Ǵ� ���̴�.
	}
	
	
	
	public static void method1(FunctionalInterface1 i){
		boolean result=i.method("java","Java");//��� ó�� ���� �𸥴�.
		System.out.println(result);
	}
}
