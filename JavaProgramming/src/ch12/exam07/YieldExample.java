package ch12.exam07;

public class YieldExample {

	public static void main(String[] args) {
		ThreadA threadA=new ThreadA();//자식 타입을 부모에 대입한다
		ThreadB threadB=new ThreadB();//B쓰레드 생성
		threadA.start();
		threadB.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			threadA.setWork(false);
		}//이경우는 B 만 실행이 된다 무의미한 if 문이 돌기 때문에 B 한테 양보를 하게 된다.
		try {//이경우는A B 번갈아 가면서 한다. 왜냐하면 동일 
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			threadA.setWork(true);
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		//thread.setStop(true);이거를 사용하지 못하는 이유는 부모 타입으로 만들었기 때문에 자식에서 정의한 메소드를 접근을 하지 못한다.
	threadA.setStop(true);
	threadB.setStop(true);
	}

}
