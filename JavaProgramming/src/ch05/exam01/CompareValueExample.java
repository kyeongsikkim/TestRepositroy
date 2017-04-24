package ch05.exam01;

public class CompareValueExample {
	public static void main(String[] args) {
		int v1=10;
		int v2=20;
		System.out.println(v1==v2);
		
		int []v3={10};//참조 타입은 무조건 객체를 참조한다. 즉 스택에 번지수를 저장한다.
		int []v4={10};
		System.out.println(v3[0]==v4[0]);//안의 배열의 값을 비교하는 것이다.
		System.out.println(v3==v4);//stack 안에 있는 변수의 값을 비교하는 것이다. 즉 번지수를 비교한다.  
		v4=v3;//v3의 번지수를 v4에 집어넣는다 즉 같은 배열 객체를 가르키게 한다.
		String name=new String("신용권");//new를 붙이면 새롭게 만들어라 그런뜻이다.
		String name1=new String("신용권");//같은 객체를 가르킨다.리터럴형태 :키보드로 입력한것을 뜻한다.
		System.out.println(v3==v4);//v3과 v4는 같은 배열이냐 같은 객체를 가르키고 있는 것이냐
		//똑같은 문자열을 입력한다면 String 객체를 공유한다.
		System.out.println(name==name1);
		 System.out.println(name.equals(name1));//내용을 비교 할때 사용한다.
	}

}
