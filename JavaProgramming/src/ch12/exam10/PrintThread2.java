package ch12.exam10;

public class PrintThread2 extends Thread {
	// Filed
	// constructor
	// Method
	public void run() {
		try {
			while (true) {
				System.out.println("���� ��...");
				System.out.println("���� ��...");// iot ���� ���� ��� �о���°�
				// Thread.sleep(1);//���� �� �߻��ؼ� ���߰� �ȴ�.�߽����ϴ����� ���� �ؼ� ���߰� �Ѵ�. wait
				// �� ���¿��� interrupt �� ������ ��ų �� �ִµ� �����Ű�� ���ܰ� �߻��ؼ� ĳġ�� ���� �ȴ�.
				// �׷��� ���� ��쿡�� if ���� ��� �Ҷ��� interrupt �޼ҵ尡 ȣ��Ƴ� Ȯ���� �ؼ� break ��
				// �ɰ� �ȴ�.
				if (isInterrupted()) {//�����尡 ���� �ִ� �޼ҵ��̴�.������ȿ����� �Ѵ� interrupted �� static �� isInterrupted �� �ִ�.�ۿ��� ������ 
					break;
				}
			}
		} catch (Exception e) {
		}

		/*
		 * System.out.println("�ڿ� ����"); System.out.println("��������");
		 */

		System.out.println("�ڿ� ����");
		System.out.println("��������");
	}
}
