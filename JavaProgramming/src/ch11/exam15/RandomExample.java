package ch11.exam15;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
/*		int random=(int)(Math.random()*6)+1;
		System.out.println(random);
		
		double random1=(Math.random()*6)+1;
		System.out.println((int)random1);
		
		int maxNum=6;
		int random3=(int)(Math.random()*maxNum)+1;
		System.out.println(random3);*///랜덤이라는 클래스 이용하는 방법
		Random obj=new Random();
		int maxNum=6;
		int num=obj.nextInt(maxNum)+1;//maxNum 의 값 전까지만 출력을 해준다. 즉 5까지 출력한다.nextInt 만 실행하면 된다.
		
	}

}
