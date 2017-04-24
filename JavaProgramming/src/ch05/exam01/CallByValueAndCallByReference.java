package ch05.exam01;

public class CallByValueAndCallByReference {
	public static void main(String[] args) {
		int v1=10;
		int v2=20;
		int v3=sum(v1,v2);
		
		System.out.println("V1:"+v1);//산술연산 기능을 할 수 도있고 문자열 결합 기능도 가지고 있다.둘다 숫자일때는 산술 한쪽이라도 문자면 문자열 결합이일어난다.
		System.out.println("V2:"+v2);
		System.out.println("v3:"+v3);
		int []v4={10,20};
		System.out.println("V4[0]:"+v4[0]);//산술연산 기능을 할 수 도있고 문자열 결합 기능도 가지고 있다.둘다 숫자일때는 산술 한쪽이라도 문자면 문자열 결합이일어난다.
		System.out.println("V4[1]:"+v4[1]);
		int v5=sum(v4);
		System.out.println("V4[0]:"+v4[0]);//산술연산 기능을 할 수 도있고 문자열 결합 기능도 가지고 있다.둘다 숫자일때는 산술 한쪽이라도 문자면 문자열 결합이일어난다.
		System.out.println("V4[1]:"+v4[1]);
		System.out.println("v5:"+v5);//참조 타입이기 때문에 값을 바꿀 수 있다.
	}
public static int sum(int x,int y){
	x=30;
	y=40;
	return (x+y);
}
public static int sum(int []scores){//여기 배열은 무슨 값이 들어올까?번지수가 들어온다.똑같은 배열을 참조하므로 한쪽에서 변경해도 변한다.
	int sum=0;
	scores[0]=30;
	scores[1]=40;
	for(int i=0;i<scores.length;i++){
		sum+=scores[i];
	}
	return sum;
}
}
