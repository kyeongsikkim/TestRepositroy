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
		System.out.println(random3);*///�����̶�� Ŭ���� �̿��ϴ� ���
		Random obj=new Random();
		int maxNum=6;
		int num=obj.nextInt(maxNum)+1;//maxNum �� �� �������� ����� ���ش�. �� 5���� ����Ѵ�.nextInt �� �����ϸ� �ȴ�.
		
	}

}
