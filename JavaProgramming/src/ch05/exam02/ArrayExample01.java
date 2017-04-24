package ch05.exam02;

public class ArrayExample01 {
	public static void main(String[]args){//비어있는 객체가 들어온다.
		int[] v1={80,90,87};
		int[] v2={80,90,87,70};//두개는 다른 객체이다.
		String[] v3={"Java","Program"};
		
		System.out.println(v1);//주소값이 나온다.
		System.out.println(v2);//주소값이 나온다.
		System.out.println(v1==v2);//참조변수 주소값을 비교하는 거기 때문에 값이 다르게 나온다.
		System.out.println(v1[0]==v2[0]);
		System.out.println(args.length);
		System.out.println(v1.length);//()없는 것은필드 ()있는 것을 메소드 라구 하자.
		System.out.println(v2.length);
		System.out.println(v3.length);
		
		int v4=v1[0]+v1[1]+v1[2];
		int v5=0;
		for(int i=0;i<v1.length;i++){//변수선언 ;조건문; 증감식
			v5+=v1[i];
		}
		
	}
}
