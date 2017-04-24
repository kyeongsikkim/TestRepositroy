package ch05.exam02;

public class ArrayExample03 {
	public static void main(String[] args) {// 비어있는 객체가 들어온다.
		int[] v1=new int[5];//값이 default 가 들어가 있는 5개짜리 배열을 새로 만들어서 대입을 하겠다. new 를 통해서 새로운 배열을 만들어서 넣는다.
		v1[0]=10;
		v1[2]=10;
		
		//오른쪽은 객체를 생성해서 객체가 가지고 있는 번지수를 왼쪽 변수에 저장 시켜준다ㅓ.
		//boolean[]v2=new boolean[5];//배열이기 때문에 참조 타입이다.
		
		String[]v2=new String[5];//왜 null 로 되어있냐면 가르키는 주소가 없어서 배열을 쓸 때 사이즈를 정해줬기 때문에 상관이 없다. 
		v2[0]="JAVA";
		v2[1]="1";
		/*String[]v3;//배열을 선언할 때 값을 넣어주던가 길이를 생성을 시켜줘야 한다. 
		v3[0]="Java";//그렇지 않고 값을 집어 넣으면 에러가 난다.
*/		
		System.out.println(v2);
		System.out.println(v2[0]);
		System.out.println(v1[0]==v1[2]);
		System.out.println(v2[0]==v2[2]);
		
	}
}