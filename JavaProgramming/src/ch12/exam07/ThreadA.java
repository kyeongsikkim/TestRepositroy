package ch12.exam07;

public class ThreadA extends Thread{
	//Field
	private boolean stop;//쓰레드를 종료하기 위한 목적
	private boolean work=true;//쓰레드 작업을 양보하기 위한 목적
	//constructor
	//method
	
	@Override
	public void run() {
		while(!stop){
			if(work){//work 가 false 경우는 계속 while 문만 도는 무의미한 반복을 할경우
			System.out.println("ThreadA 작업 중.....");
			}else{
				yield();
			}
		}
		 System.out.println("ThreadA 작업 종료");
	}
	

	public void setStop(boolean stop) {
		this.stop = stop;
	}


	public void setWork(boolean work) {
		this.work = work;
	}

}
