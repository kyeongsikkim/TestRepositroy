package ch14.exam07;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {

	public static void main(String[] args) {
		method1(new Consumer<String>(){//new 
			@Override
			public void accept(String t) {
				System.out.println(t);

			}
		});
		method1((s)->{//매개변수하나를 받는다.
			System.out.println("과목:"+s);
		});
		method2((a,b)->{
			System.out.println(a+"-"+b);
		});
		/*method2(new BiConsumer<String,String>(){
			@Override
			public void accept(String t, String u) {				
			}
		});*/
		method3((o,i)->{
			for(int k=0;k<i;k++){
				System.out.println(o);
			}
		});
	}

	public static void method1(Consumer<String>arg){//매개값으로 하나받는다. String 다형성으로 Consumer 의 객체를 집어 넣을 수 있다.
		arg.accept("Java");//어떻게 소비한다는 것은 없다. 구현객체를 만들어야지 알 수 있다.
	}
	public static void method2(BiConsumer<String,String>arg){//함수적 인터페이스 추상 메소드가 하나만 있다.
		arg.accept("Iot", "Java");
	}
	public static void method3(ObjIntConsumer<String>arg){//오브젝트 타입만 남겨주고 obj 는 타입이 먼지 알려줘야 한다. int 타입이라고 알려줬기 때문에 obj 만 알려주면 된다.
		arg.accept("홍길동", 2);
	}
}
