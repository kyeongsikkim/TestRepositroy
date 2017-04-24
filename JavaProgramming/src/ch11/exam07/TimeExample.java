package ch11.exam07;

public class TimeExample {

	public static void main(String[] args) {
		int sum=0;
		//long startTime=System.currentTimeMillis();//현재 시간의 롱값을 리턴한다.millis 는 1/1000;초이다.
		long startTime=System.nanoTime();//10의 -9승 1/1000000000;
		for(int i=0;i<100000;i++){//만번도는데 얼마나 걸렸을까 시간이 
			sum+=i;
		}
		//long endTime=System.currentTimeMillis();
		long endTime=System.nanoTime();
		System.out.println(endTime-startTime);
	}
	
}
//운영체제 에서얻을 수있는 시간 현재로그인 사람 누군가 현재 os 종류 가 무엇인가 현재 자바의 버전
//운영체제와 다리역할을 해주는 것이 시스템이다.