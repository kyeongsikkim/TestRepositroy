package ch12.exam11;

public class AutoSaveThread extends Thread{
	@Override
	public void run() {
while(true){
	try {Thread.sleep(1000);} catch (InterruptedException e) {}
	save();
}
	}
	public void save(){
		System.out.println("작업 내용을 저장함");
	}
}
