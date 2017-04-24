package ch12.exam06;

public class StatePrintThread extends Thread {	
	private Thread targetThread;

	public StatePrintThread(Thread targetThread) {//목표 쓰레드가 있어야한다.
		this.targetThread = targetThread;
	}

	public void run() {
		while(true) {
			Thread.State state = targetThread.getState();
			System.out.println("타겟 스레드 상태: " + state);//문자열 +객체는 .toString 형태로 출력이 된다. 왜냐하면 문자형태로 출력이 되서
			if(state == Thread.State.NEW) {
				targetThread.start();
			}
			if(state == Thread.State.TERMINATED) {
				break;
			}
			try {
				//0.5초간 일시 정지
				Thread.sleep(500);//상태확인하는거 500초동안 확인 하는것 
			} catch(Exception e) {}
		}
	}
}

