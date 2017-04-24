package ch11.exam14;


import java.util.Arrays;
import java.util.Collections;
//객체 안의 값을 비교할 때 toString 를 재정의 해야 된다. 다형성으로 타입 변환을 해야 된다.
public class SortExample {

	public static void main(String[] args) {
	/*	String xx="yy";
		System.out.println(xx);
		System.out.println(xx.toString());*/
		String[]names={"홍길동","김민수","박동수"};//스트링은 comparable 를 구현했다 interfac 를 구현을 해서 사용을 할 수 있다.
		
		System.out.println(Arrays.toString(names/*.toString 가 붙어서 출력이 되는것인데 String 값에서 이미 toString 에 대한 정의를 해놓은 것이다.*/));//배열에 있는 것을 출력하게 된다.
		//올림차순으로 정렬 
		Arrays.sort(names);
		
		System.out.println(Arrays.toString(names));
		//내림차순
		Arrays.sort(names,Collections.reverseOrder());
		
		Member[] members={new Member("홍길동",20),new Member("김민수",15),new Member("박동수",18)};
		
		System.out.println(Arrays.toString(members));//객체의 toString 을 넣게 되면은  패키지 이름 이 나오고 클래스가 나온다. 타입변환이 될려면 상속을 받던가 인터페이스라면 멤버는 구현을 해야 된다.
		
		Arrays.sort(members);
		System.out.println(Arrays.toString(members/*.toString()*오브젝트의 toString 가 붙어 있는 것이다.*/));
		
		Arrays.sort(members,Collections.reverseOrder());
		System.out.println(Arrays.toString(members));
	}

}
//sort 라는 안에서 Comparable com=new Member("홍길동"); 이게 안된다는 뜻이다.
//comparable 는 머를 기준으로 정렬을 할지 정하는 것이다.