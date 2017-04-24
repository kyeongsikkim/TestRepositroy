package ch12.exam10;

public class StopFlagExample {

	public static void main(String[] args) {
		//how1
		PrintThread1 printThread=new PrintThread1();
		printThread.start();
		try{
		Thread.sleep(2000);
		}catch(Exception e){
		}
		printThread.setStop(true);
	}
}
