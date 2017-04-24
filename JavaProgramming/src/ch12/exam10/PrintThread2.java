package ch12.exam10;

public class PrintThread2 extends Thread {
	// Filed
	// constructor
	// Method
	public void run() {
		try {
			while (true) {
				System.out.println("실행 중...");
				System.out.println("실행 중...");// iot 에서 값을 계속 읽어오는것
				// Thread.sleep(1);//예외 가 발생해서 멈추게 된다.잘실행하던것을 쉬게 해서 멈추개 한다. wait
				// 인 상태에서 interrupt 를 실행을 시킬 수 있는데 실행시키면 예외가 발생해서 캐치로 가게 된다.
				// 그렇게 안할 경우에는 if 문을 사용 할때는 interrupt 메소드가 호출됐나 확인을 해서 break 를
				// 걸게 된다.
				if (isInterrupted()) {//쓰레드가 갖고 있는 메소드이다.쓰레드안에서는 둘다 interrupted 는 static 과 isInterrupted 가 있다.밖에서 쓸때는 
					break;
				}
			}
		} catch (Exception e) {
		}

		/*
		 * System.out.println("자원 정리"); System.out.println("실행종료");
		 */

		System.out.println("자원 정리");
		System.out.println("실행종료");
	}
}
