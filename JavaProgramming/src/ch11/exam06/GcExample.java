package ch11.exam06;

public class GcExample {

	public static void main(String[] args) {
	/*	Member m1=new Member("blue");//������
		m1=null;
		m1=new Member("white");//������
		m1=new Member("red");*/
		for(int i=0;i<10000;i++){
			Member m1=new Member(String.valueOf(i));//���ڿ� ���ڸ� ���ϸ� ���� ��޵ȴ�.""+i;
			System.gc();//JVM �� ����� ������ ���� ����� �Ѵ�. �� ��� ���Ѵ�.
		}
		

	}

}
