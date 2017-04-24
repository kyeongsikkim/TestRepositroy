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
		System.out.println("실행 중...");
		System.out.println("실행 중...");//iot 에서 값을 계속 읽어오는것 
		}
		System.out.println("자원 정리");
		System.out.println("실행종료");
		}
	}


