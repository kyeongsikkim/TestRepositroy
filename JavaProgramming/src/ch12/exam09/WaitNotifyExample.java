package ch12.exam09;

public class WaitNotifyExample {
	public static void main(String[]args){
	//공유객체 부터 
	DataBox databox=new DataBox ();
	
	//쓰레드 생성
	ReadThread t1=new ReadThread(databox);
	WriteThread t2=new WriteThread(databox);
	t1.start();
	t2.start();
	}
}
