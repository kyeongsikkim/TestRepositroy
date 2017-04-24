package ch10.exam02;

import java.util.Scanner;

public class RuntimeExceptionExample {

	public static void main(String[] args) {//실행할때 매개값을 주지 않으면 선언만 된것이지 배열이 생성된것은 아니다.

		try{
	String str=null;
	System.out.println(str.length());//함수이다.jvm 이 여기서 발생한 exception 이 먼지 알아 내고 그다음에 예외 처리 객체를 만들어서 e 에다가 주소값을 넣어준다.
		}catch(NullPointerException e){//예외를 잡아라 변수처리하는 것이다. 예외가 발생하면 객체를 만들어서 객체안에 예외에 대한 정보가 있다. 객체의 번지를 어디가 넣어주냐
			 
			System.out.println(e.getMessage());//객체로 접근을 해서 get 메소드를 호출해라 에러의 메세지가 먼지 문자열로 알려준다. nullPointException 
		}finally{//예외가 발생하던 안하던 실행하라는 코드이다.
			System.out.println("정상적으로 실행되도록 함 ");
		}
		Scanner scanner=new Scanner(System.in);
		while(true){
			
			System.out.print("입력:");
			String strNum=scanner.nextLine();
			try{
			int num=Integer.parseInt(strNum);//숫자가 아닌 문자를 집어넣었을 경우 numberformat exception 이 발생 할 수 있다. NumberFormatException 
		}catch(NumberFormatException e){
			System.out.println("숫자만 입력하세요");
		}
		}
	}

}
