package ch12.exam11;

public class DemonExample {

	public static void main(String[] args) {//���� �����尡 �׾��ٰ� �ؼ� �ٸ� �����尡 ������ �ʴ´�. �׷��� ���ξ����� ������ ��� �����带 ���̴� ���  �ֽ����尡 ������ ���������尡 �װ�
		System.out.println("���� ���μ����� ������");
		AutoSaveThread thread=new AutoSaveThread();
		thread.setDaemon(true);//���󾲷��嵵 �׾������.�ָ� �����ϴ°� �־����尡 �ȴ�.
		thread.start();
		try{
			Thread.sleep(5000);
		}catch(Exception e){}
		
		System.out.println("���� ���μ����� ������");
	
	}
}
//���μ����� ���ᰡ �ȵȴ� ���� ������� ������ �������μ����� �����մ�.

//������ �׷�ȭ ��Ű�� ����:�׷�ȭ ��Ű�°� ���ͷ�Ʈ ���� �ٶ��