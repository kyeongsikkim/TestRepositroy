package ch12.exam01;

import java.awt.Toolkit;

public class BeepPrintExample {
	//������ ���ν����尡 ���� ��Ų��. ���ν������ �۾������� �������� ������ �Ѵ�.
	//�۾�������� ��ŸƮ�� �ϴ� ���� ��Ų��.���ν����尡 ������ ��Ų��.
	public static void main(String[] args) {//���ν����� ���ν����尡 ���ο� �����带 �ϳ� ���� ���� ��Ų��. 
	/*BeepTask beepTask=new BeepTask();//���������� ����� �Ұ��� �̷��� ����� ���� ����ϴ°� ����.
	
	Thread thread=new Thread(beepTask);//beep �����带 ����� ����.
	thread.start();*/
	Thread thread=new Thread(new Runnable(){
		@Override
		public void run() {
			//�Ҹ��� ���� �ڵ�
			Toolkit toolkit=Toolkit.getDefaultToolkit();//Toolkit ���� new �������� �ٷ� ����߱� ������ static �̴�.
			for(int i=0;i<5;i++){
				toolkit.beep();//�ϳ��� �Ҹ��������� �̹� �ټ��� ������ �ٵ����̴�. �����带 �Ͻ� ���� 
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
						
				}
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
