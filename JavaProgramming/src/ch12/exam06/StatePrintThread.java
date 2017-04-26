package ch12.exam06;

public class StatePrintThread extends Thread {	
	private Thread targetThread;

	public StatePrintThread(Thread targetThread) {//��ǥ �����尡 �־���Ѵ�.
		this.targetThread = targetThread;
	}

	public void run() {
		while(true) {
			Thread.State state = targetThread.getState();
			System.out.println("Ÿ�� ������ ����: " + state);//���ڿ� +��ü�� .toString ���·� ����� �ȴ�. �ֳ��ϸ� �������·� ����� �Ǽ�
			if(state == Thread.State.NEW) {
				targetThread.start();
			}
			if(state == Thread.State.TERMINATED) {
				break;
			}
			try {
				//0.5�ʰ� �Ͻ� ����
				Thread.sleep(500);//����Ȯ���ϴ°� 500�ʵ��� Ȯ�� �ϴ°� 
			} catch(Exception e) {}
		}
	}
}
