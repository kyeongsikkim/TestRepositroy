package ch14.exam02;

public class LambdaExpressionExample {

	public static void main(String[] args) {//익명객체를 만들어서 재정의 하는 것이다.
		//////////////////익명 객체 생성/////////////////////////////////
		method1(new FunctionalInterface1(){//이 객체 인지 어떻게 아나?
			@Override
			public void method() {
				System.out.println("run...");
			}
		});
		//////////////////////////////////////////////////////////////////
		method1(()->{
			System.out.println("run...");
		});//한줄일때는 중괄호가 없어도 된다.
		method2((a)->{//매개변수 하나만 받는다.
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
		
	//method2(a->sys(a+"run..")); 하나일때는 이렇게 사용해도 가능하다.
		/*method1(new FunctionalInterface1(){
		@Override
		public void method() {
			System.out.println("run...");
		
			}
		});
	}*/
	public static void method1(FunctionalInterface1 i){//인터페이스를 매개변수로 넣어서 
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
