package ch12.exam07;

public class YieldExample {

	public static void main(String[] args) {
		ThreadA threadA=new ThreadA();//�ڽ� Ÿ���� �θ� �����Ѵ�
		ThreadB threadB=new ThreadB();//B������ ����
		threadA.start();
		threadB.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			threadA.setWork(false);
		}//�̰��� B �� ������ �ȴ� ���ǹ��� if ���� ���� ������ B ���� �纸�� �ϰ� �ȴ�.
		try {//�̰���A B ������ ���鼭 �Ѵ�. �ֳ��ϸ� ���� 
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			threadA.setWork(true);
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		//thread.setStop(true);�̰Ÿ� ������� ���ϴ� ������ �θ� Ÿ������ ������� ������ �ڽĿ��� ������ �޼ҵ带 ������ ���� ���Ѵ�.
	threadA.setStop(true);
	threadB.setStop(true);
	}

}
