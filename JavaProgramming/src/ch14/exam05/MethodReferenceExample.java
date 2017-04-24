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
	//두개의 매개 값이 하나의 곳으로 들어가야 한다.
	method1(String::equals);//equals 는인스턴스 메소드인다
	//a.equals(b)로 해석을 해야 된다. static 의 메소드 일경우는 
	//두개의 매개값으로 들어가게 된다. 인스턴스 메소드면 a.메소드b 가 되는 것이다.
	}
	
	
	
	public static void method1(FunctionalInterface1 i){
		boolean result=i.method("java","Java");//어떻게 처리 할지 모른다.
		System.out.println(result);
	}
}
