package ch14.exam01;

import java.awt.Toolkit;

public class BeepPrintExample {
	//������ ���ν����尡 ���� ��Ų��. ���ν������ �۾������� �������� ������ �Ѵ�.
	//�۾�������� ��ŸƮ�� �ϴ� ���� ��Ų��.���ν����尡 ������ ��Ų��.
	public static void main(String[] args) {//���ν����� ���ν����尡 ���ο� �����带 �ϳ� ���� ���� ��Ų��. 

	Thread thread=new Thread(()->{//�����Ϸ��� new Thread() ������ �ȿ��� Runnable �� �´ٴ� ���� �ȴ�.()�� run () �� �Ű����� �̴�. {}�� run�� ������ �� ���� �̴�.
	
			Toolkit toolkit=Toolkit.getDefaultToolkit();//Toolkit ���� new �������� �ٷ� ����߱� ������ static �̴�.
			for(int i=0;i<5;i++){
				toolkit.beep();//�ϳ��� �Ҹ��������� �̹� �ټ��� ������ �ٵ����̴�. �����带 �Ͻ� ���� 
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
						
				}
			}
	});
	thread.start();
		//����Ʈ �ϴ� �ڵ�
		for(int i=0;i<5;i++){
			System.out.println("��");
		
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				
				}
		
			
		}
			
	}

}
