package ch12.exam10;

public class StopInterruptExample {

	public static void main(String[] args) {
	//how2
		PrintThread2 thread2=new PrintThread2();
		thread2.start();
		//메인 스레드이다.
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		thread2.interrupt();//실행 중일땐 의미가 없다 
	}

}
