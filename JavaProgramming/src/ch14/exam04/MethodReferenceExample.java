package ch14.exam04;

public class MethodReferenceExample {

	public static void main(String[] args) {
	/////익명객체///////////////////////////////////////////////////////
	method1(new FunctionalInterface1(){
		@Override
		public int method(int a, int b) {
			return Math.max(a, b);
		}
	});
	//////////////////람다식////////////////////////////
		method1((a,b)->{
			return Math.max(a, b);
		});
		method1((a,b)->Math.max(a, b));
		method1(Math::max);//::두개 들어가면 메소드 참조 이다.메소드를 호출 하는 것이다.
		///////////////////////////////////////////////////////////////////////////
      method1(new FunctionalInterface1(){
			@Override
			public int method(int a, int b) {
				return Math.min(a, b);
			}
		});
		method1(Math::min);

		//////////////////////////////////////////////////////////////////////
		  method1(new FunctionalInterface1(){
				@Override
				public int method(int a, int b) {
					return Calculator.staticSum(a, b);
				}
			});
		
		method1((a,b)->{
			return Calculator.staticSum(a, b);
		});
		method1((a,b)->Calculator.staticSum(a, b));
		method1(Calculator::staticSum);
	///////////////////////////////////////////////////////////////////////////////////////
		  method1(new FunctionalInterface1(){
				@Override
				public int method(int a, int b) {
					return Calculator.staticMulti(a, b);
				}
			});
		
		method1((a,b)->{
			return Calculator.staticMulti(a, b);
		});
		method1((a,b)->Calculator.staticMulti(a, b));
		
		method1(Calculator::staticMulti);
		//////////////////////////////////////////////////////////////////////
		Calculator calc=new Calculator();
		method1((a,b)->{
			return calc.minus(a, b);
		});
		method1((a,b)-> calc.minus(a, b));
		
		method1(calc::minus);
	//////////////////////////////////////////////////////////////////////////////
	}
	
	
	public static void method1(FunctionalInterface1 i){
		int result=i.method(3,5);//어떻게 처리 할지 모른다.
		System.out.println(result);
	}
}
