package ch12.exam08;

public class JoinExample {

	public static void main(String[] args) {
		SumThread thread=new SumThread();
		thread.start();//������ ���� �׷��� �Ǹ��� 
		try {//���ξ������̴�. �տ� thread �� ���°� �ƴϴ�.
			thread.join();//���ξ����� ���� ������ ��ٸ��� �ִ� ���ξ����尡 ��ٸ��� �ִ� 
		} catch (InterruptedException e) {
		}
		long result=thread.getSum();//1�� ���ϱ⵵ ���� getsum() ���޶���ؼ� 
		System.out.println(result);
	}

}
