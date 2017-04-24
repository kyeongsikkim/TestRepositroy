package ch12.exam08;

public class JoinExample {

	public static void main(String[] args) {
		SumThread thread=new SumThread();
		thread.start();//쓰레드 시작 그렇기 되면은 
		try {//메인쓰레드이다. 앞에 thread 를 보는게 아니다.
			thread.join();//메인쓰레드 현재 메인이 기다리고 있다 메인쓰레드가 기다리고 있다 
		} catch (InterruptedException e) {
		}
		long result=thread.getSum();//1을 더하기도 전에 getsum() 을달라고해서 
		System.out.println(result);
	}

}
