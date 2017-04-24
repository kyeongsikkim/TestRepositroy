package ch12.exam06;

public class ThreadStateExample {
	public static void main(String[] args) {
		StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());//생성자 매개값으로 TargetThread 를 준 것이다.
		statePrintThread.start();
	}
}
