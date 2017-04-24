package ch14.exam07;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
	
		method1(()->{
			return "홍길동";
					
		});
		method2(()->{
			return 5;
		});
		
	}
	public static void method1(Supplier<String>arg){
		String result=arg.get();//get 을 재정의 해야 된다.
	}
	public static void method2(IntSupplier arg){//IntSupplier 라는 타입이다.  리턴 타입을 알려주는 것이다.
		int result=arg.getAsInt();//get 을 재정의 해야 된다.
	}
}
