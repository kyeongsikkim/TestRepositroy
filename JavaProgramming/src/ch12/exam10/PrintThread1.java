package ch12.exam10;

public class PrintThread1 extends Thread{
	//Filed
	private boolean stop; 
	
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	//constructor
	//Method
	public void run(){
		while(!stop){
		System.out.println("���� ��...");
		System.out.println("���� ��...");//iot ���� ���� ��� �о���°� 
		}
		System.out.println("�ڿ� ����");
		System.out.println("��������");
		}
	}


