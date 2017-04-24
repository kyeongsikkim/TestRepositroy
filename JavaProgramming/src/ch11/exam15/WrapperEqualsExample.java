package ch11.exam15;

public class WrapperEqualsExample {

	public static void main(String[] args) {
		/*Integer v1=new Integer(10);
		Integer v2=new Integer(10);*/
		
		Integer v1=1000;
		Integer v2=1000;//-127에서 ~128 은 문제가 안되지만 그이상은 안된다.
		
		//System.out.println(v1==v2);//기본타입이 아닐경우 값비교로 ==를 사용하지 마라 
		//System.out.println(v1.intValue()==v2.intValue());//true
		System.out.println(v1.equals(v2));//equals 는 재정의 
	}

}
