package ch11.exam07;

public class TimeExample {

	public static void main(String[] args) {
		int sum=0;
		//long startTime=System.currentTimeMillis();//���� �ð��� �հ��� �����Ѵ�.millis �� 1/1000;���̴�.
		long startTime=System.nanoTime();//10�� -9�� 1/1000000000;
		for(int i=0;i<100000;i++){//�������µ� �󸶳� �ɷ����� �ð��� 
			sum+=i;
		}
		//long endTime=System.currentTimeMillis();
		long endTime=System.nanoTime();
		System.out.println(endTime-startTime);
	}
	
}
//�ü�� �������� ���ִ� �ð� ����α��� ��� ������ ���� os ���� �� �����ΰ� ���� �ڹ��� ����
//�ü���� �ٸ������� ���ִ� ���� �ý����̴�.