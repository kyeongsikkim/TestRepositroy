package ch12.exam02;
import java.awt.Toolkit;
public class BeepExample {
	public static void main(String[] args) {
		//�Ҹ��� ���� �ڵ� 
		/*BeepThread beepThread=new BeepThread();
		beepThread.start();*/
		
		Thread thread=new Thread(){
			@Override
			public void run() {
				Toolkit toolkit=Toolkit.getDefaultToolkit();
				for(int i=0;i<5;i++){
					toolkit.beep();
					System.out.println(Thread.currentThread().getName());
					try{
						Thread.sleep(500);
					}catch(InterruptedException e){
					}
			}
		}
		}; //Thread�� �͸�ü
		//System.out.println(Thread.currentThread().getName());
		thread.start();
		
		//����Ʈ�� �ϴ� �ڵ�
		for(int i=0;i<5;i++){
			System.out.println("��");
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){
			}
		}
	}
}
