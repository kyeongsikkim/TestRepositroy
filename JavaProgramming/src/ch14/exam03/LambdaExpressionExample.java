package ch14.exam03;

public class LambdaExpressionExample {
	public static int a=5;
	
	public static void main(String[] args) {//익명객체를 만들어서 재정의 하는 것이다.
		method1(()->{
			//a=9;필드의 값변경은 가능하다.
			System.out.println(a);//재정의 한것이다.
		});
		
		final int b=5;//메인이 끝나면 사라지게 된다. 메인쓰레드가 사라지면 없어지게 된다. 필드 값으로 남겨 놔야 사용이 가능하다. 실행하면서 값을 바꾸면 안된다.final 이 안붙어 있어서도 붙어있는것이다.
		//로컬 변수를 람다식 안에서 사용할때 익명객체 안에서 사용하는 것과 똑같기 때문에 값을 변경할 수 없다.
		method1(()->{//익명객체 
			while(true){
			System.out.println(b);
			}
		});
	}
	public static void method1(FunctionalInterface1 i){
		i.method();
	} 
}

 
//람다식으로 바꿀수 있는것은 함수적 인터페이스 그리고 반드시 추상메소드가 하나만 있어야 람다식으로 변경이 가능하다.