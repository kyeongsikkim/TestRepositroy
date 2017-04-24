package ch05.exam03;

import java.io.IOException;

public class ReadKeyCodeExample {
	//JVM 이 호출을 하게 된다.JVM 은 단순히 출력만 하고 끝나게 한다.
	public static void main(String[] args)throws Exception {
		int keycode=0;
		System.out.println("------------------------------------");
		System.out.println("1.저장 |2.읽기| 3.종료 ");
		System.out.println("------------------------------------");
		
		while(true){
		
		
		if(keycode!=13 && keycode!=10){
			System.out.println("번호선택");
		}
		keycode=System.in.read();//enter 을 치면 13하고 10하고 두개가 발생이 된다.
		
		switch(keycode){
		case 49:
			System.out.println("저장을 선택하셨습니다");
			break;
		case 50:
			System.out.println("읽기를 선택 하셨습니다");
			break;
		case 51:
			System.out.println("종료를 선택 하셨습니다");
			//return ;
			System.exit(0);//jvm 을 종료 시키는 것이다.
		}
		//패키지 이름까지 포함 풀네임 이기 때문에 bin까지 간다음에 명령프롬트창 열고 실행을 시킨다.
		//.class 파일있는 곳에서 실행을 시킨다.
		
		}
		
	}

}
