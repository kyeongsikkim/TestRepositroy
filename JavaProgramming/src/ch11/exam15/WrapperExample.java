package ch11.exam15;

public class WrapperExample {

	public static void main(String[] args) {
		int v1=10;
		Integer v2=10;//Integer 은 클래스 타입이다. 해석할때는 10을 가지고 있는 integer 의 객체가 자동으로 만들어져 그번지가 저장이 된다.박싱
		int v3=v2;//v2가 가지고 있는 값을 꺼내서 대입한다 언박싱
		method(3);//이것은  object 에 대입 될때는 박싱해서 integer 로 변경이 된다음에 obj 에 대입이 된다.
		int v4=method2();//자동 언박싱이 발생해서 대입이 가능해진다.
	}
	public static void method(Integer obj){//object obj 
		
	}
	public static Integer method2(){
		return 1;
	}
	

}
