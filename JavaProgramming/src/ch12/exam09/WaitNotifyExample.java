package ch12.exam09;

public class WaitNotifyExample {
	public static void main(String[]args){
	//������ü ���� 
	DataBox databox=new DataBox ();
	
	//������ ����
	ReadThread t1=new ReadThread(databox);
	WriteThread t2=new WriteThread(databox);
	t1.start();
	t2.start();
	}
}
