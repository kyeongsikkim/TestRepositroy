package ch12.exam09;

public class WriteThread extends Thread{
	private DataBox dataBox;
	
	public WriteThread(DataBox dataBox){//��ü�� �޾Ƽ� ������ ���̴�.
		this.dataBox=dataBox;
	}
	@Override//������ ���� ��ų���� run �޼ҵ带 �����Ǹ� �ؾ� �ȴ�.
	public void run() {
		for(int i=0;i<10;i++){
			dataBox.setData(String.valueOf(i));
		}
	}
}
