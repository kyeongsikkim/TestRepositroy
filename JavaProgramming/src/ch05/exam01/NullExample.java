package ch05.exam01;

public class NullExample {

	public static void main(String[] args) {
		String v1=null;//변수가 생성되기위해서는 값이 있어야 한다. null 값이 든 무슨 값이든 하지만 String 객체가 생성이 된것은 아니다. 변수만 만들어놓고 가르키면 객체가 없다. 
		
		String v2;
		v2=null;//이시점에서 변수가 생성이 되는것이다.객체를 생성되는 시점은 변수에 값을 집어 넣을 때이다. 기본타입은 null 이 안들어가구 값이 없으면 변수생성이 안된다.
		
		int[]v3=null;//참조 타입은 똑같은 원리이다.배열은 생성이 된것이 아니다.
		System.out.println(v2);
		if(v3==null){
			System.out.println("null");
		}else if(v3!=null){
			System.out.println("not null");
		}
	}

}
