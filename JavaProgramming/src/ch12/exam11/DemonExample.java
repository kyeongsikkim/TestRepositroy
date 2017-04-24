package ch12.exam11;

public class DemonExample {

	public static void main(String[] args) {//메인 쓰레드가 죽었다고 해서 다른 스레드가 죽지는 않는다. 그래서 메인쓰레드 죽을때 모든 쓰레드를 죽이는 방법  주스레드가 죽으면 보조스레드가 죽게
		System.out.println("워드 프로세스를 시작함");
		AutoSaveThread thread=new AutoSaveThread();
		thread.setDaemon(true);//데몬쓰레드도 죽어버린다.애를 실행하는게 주쓰레드가 된다.
		thread.start();
		try{
			Thread.sleep(5000);
		}catch(Exception e){}
		
		System.out.println("워드 프로세스를 종료함");
	
	}
}
//프로세스가 종료가 안된다 메인 쓰레드는 끝나도 워드프로세스는 남아잇다.

//스레드 그룹화 시키는 이유:그룹화 시키는것 인터럽트 시켜 줄라고