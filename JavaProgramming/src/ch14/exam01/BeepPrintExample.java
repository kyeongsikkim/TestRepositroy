package ch14.exam01;

import java.awt.Toolkit;

public class BeepPrintExample {
	//메인은 메인스레드가 실행 시킨다. 메인스레드는 작업스레드 전까지만 실행을 한다.
	//작업스레드는 스타트가 하는 순간 시킨다.메인스레드가 실행을 시킨다.
	public static void main(String[] args) {//메인스레드 메인스레드가 새로운 스레드를 하나 만들어서 실행 시킨다. 

	Thread thread=new Thread(()->{//컴파일러가 new Thread() 생성자 안에는 Runnable 이 온다는 것을 안다.()는 run () 의 매개변수 이다. {}는 run에 재정의 된 내용 이다.
	
			Toolkit toolkit=Toolkit.getDefaultToolkit();//Toolkit 에서 new 생성없이 바로 사용했기 때문에 static 이다.
			for(int i=0;i<5;i++){
				toolkit.beep();//하나의 소리음을낼때 이미 다섯번 루프를 다돈것이다. 스레드를 일시 정지 
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
						
				}
			}
	});
	thread.start();
		//프린트 하는 코드
		for(int i=0;i<5;i++){
			System.out.println("띵");
		
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				
				}
		
			
		}
			
	}

}
