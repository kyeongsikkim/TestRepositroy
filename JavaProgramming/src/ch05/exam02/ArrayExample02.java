package ch05.exam02;

public class ArrayExample02 {
	public static void main(String[] args) {// 비어있는 객체가 들어온다.
		int[] v1={10,20,30};//컴파일러는 배열의 길이가 얼만큼 되는지 확인을 해줘야 한다. 배열의 길이를 보고 생성한다.
		System.out.println(v1);
		
		int[]v3=new int[3];
		v3[0]=10;
		int[]v2;//객체를 생성할때 길이 얼만큼 되는지 모른다.
		String num=null;
		System.out.println(num);
		//v2={10,20,30}//배열 의 길이를 먼저 선언을 해주어야 한다.
		v2=new int[]{10,20,30};//새로운 객체 배열을 만들어서 대입시켜줄 경우는 가능하다.
		System.out.println(v2);
		int result=sum(v1);
		int result2=sum(v2);
		//sum({10,20,30});배열을 만들 때는 변수를 선언하고서 값을 넣을 때는 안들어가진다. 변수를 선언할 때 값을 넣어줘야 한다. 값을 넣어주고 싶을 경우에는 new int [] 배열로 새롭게 만들어 준다.
		sum(new int[]{10,20,30});
		System.out.println(result);
		System.out.println(result2);
	}
	public static int sum (int[]v2){//번지수를 전달 받는다.
		int sum=0;//변수는 값이 들어갈 때 변수가 생성이 된다.
		for(int i=0;i<v2.length;i++){
			//sum=sum+v2[i];//연산자 두개 
			sum+=v2[i];//연산자 하나 자바 는 똑같이 한다.
		}
		return sum;
}
}