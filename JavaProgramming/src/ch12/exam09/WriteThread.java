package ch12.exam09;

public class WriteThread extends Thread{
	private DataBox dataBox;
	
	public WriteThread(DataBox dataBox){//객체를 받아서 생성한 것이다.
		this.dataBox=dataBox;
	}
	@Override//쓰레드 실행 시킬려면 run 메소드를 재정의를 해야 된다.
	public void run() {
		for(int i=0;i<10;i++){
			dataBox.setData(String.valueOf(i));
		}
	}
}
