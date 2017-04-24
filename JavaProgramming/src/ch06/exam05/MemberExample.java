package ch06.exam05;

import java.util.Scanner;
public class MemberExample {
//물어볼거 프롬트 창에서 실행시키는것??? 
	public static void main(String[] args) {
	/*	//while(true){//참조타입으로 scanner 변수 선언만 한것
			Scanner scanner=new Scanner(System.in);//어디 패키지에 있는 클래스인지 명시를 해줘야 하기 때문에 import 를 해야 한다.
			//자바 utill 패키지 안에 있고 JAVA 표준 API 이생성자는 클래스 안에 없다.
			//서머리에서 API 를 들어가면 생성자 메소드를 확인 할 수 있다.
			//system.in 은 키보드로 부터 읽어들인다.생성자는 객체를 만들때만 사용을 한다.
		//scanner.nextLine();//엔터치기 전까지 모든 문자열을 읽어들여라
		int num=scanner.nextInt();//12/r/n 엔터를 치면 이렇게 된다.엔터치기 전까지 읽는다.nextInt();12까지 읽는다.
		System.out.println(num);
		int num2=scanner.nextInt();
		System.out.println(num2);
		String str=scanner.nextLine();
		System.out.println(str);
		//보통은 다 문자열을 받아들이고 parseint 로 바꿔서 사용을 한다.
*/	
		Scanner scanner=new Scanner(System.in);
		Member[] members=new Member[100];//단순히 배열만 만든것 null 참조변수는 null이다. 빈 배열이기때문에 가르키는 주소가 없다.
		while(true){
			System.out.println("-----------------------");
			System.out.println("1.회원가입|5.종료");
			//Scanner scanner=new Scanner(System.in);//이렇게 생성을 하면heap영역에 계속해서 생기게 된다.
		System.out.print("선택:");//줄바꿈이 되는 것이다.
		String strNum=scanner.nextLine();
		//원래는 정수만 들어가지만 문자열 정수가 들어 갈 수 있다.
		if(strNum.equals("1")){
			String name=scanner.nextLine();
			int age=Integer.parseInt(scanner.nextLine());
			Member member=new Member(name,age);
			for(int i=0;i<members.length;i++){
				if(members[i]==null){//가르키는 주소가 있나 없나 확인하는것 
					members[i]=member;
					break;
				}
			}
			//members[i]=new Member(name,age);
		}else if(strNum.equals("5")){
			
		}
		//삭제 효과는 null 을 이용한다. 그러면 새로운 객체를 만들어서 연결을 시켜줄 수 있다.
		}
		}

}
