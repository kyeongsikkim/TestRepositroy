package ch14.exam07;

import java.util.function.DoubleToIntFunction;
import java.util.function.Function;

import ch14.exam06.Member;

public class FunctionExample {

	public static void main(String[] args) {

		method1((a)->{
			return (int)(a);});
	}
	/*	method1((a)->{
		return (int)(Math.round(a);});*///반올림을 해서 int 형으로 변환 시켜라 
	
/*	method2((m)->{
		return m.getMname();//이름을 뽑아내는것
	});*/
	//색깔을 뽑아내는것 
	/*method2(new Function<Member,String>(){
		public String apply(Member t) {
			
		};
	});*/
	public static void method1(DoubleToIntFunction arg){
		int result=arg.applyAsInt(3.54);//어떤것을 넣냐에 따라서 값이 다르다. 구현 객체를 해줘야 한다.더블을 주면 인트가 나온다 메소드 호출할때정의해준다.
	}
	public static void method2(Function<Member,String>arg){//Member 을 받아서 R로 리턴 객체를 받을 때만 타입을 알려줘야 한다.
		Member member=new Member("white","홍길동");
		String result=arg.apply(member);//멤버주면 그냥 스트링이 나온다.
		System.err.println(result);
	}
}