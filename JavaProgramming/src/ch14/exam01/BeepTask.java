package ch14.exam01;

import java.awt.Toolkit;

public class BeepTask implements Runnable{//�������̽� �����ϰ� ���

	@Override
	public void run() {
		//�Ҹ��� ���� �ڵ�
		Toolkit toolkit=Toolkit.getDefaultToolkit();//Toolkit ���� new �������� �ٷ� ����߱� ������ static �̴�.
		
		for(int i=0;i<5;i++){
			toolkit.beep();//�ϳ��� �Ҹ��������� �̹� �ټ��� ������ �ٵ����̴�. �����带 �Ͻ� ���� 
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
