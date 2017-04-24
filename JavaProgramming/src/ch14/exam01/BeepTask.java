package ch14.exam01;

import java.awt.Toolkit;

public class BeepTask implements Runnable{//인터페이스 정의하고 사용

	@Override
	public void run() {
		//소리를 내는 코드
		Toolkit toolkit=Toolkit.getDefaultToolkit();//Toolkit 에서 new 생성없이 바로 사용했기 때문에 static 이다.
		
		for(int i=0;i<5;i++){
			toolkit.beep();//하나의 소리음을낼때 이미 다섯번 루프를 다돈것이다. 스레드를 일시 정지 
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
