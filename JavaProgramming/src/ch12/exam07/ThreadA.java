package ch12.exam07;

public class ThreadA extends Thread{
	//Field
	private boolean stop;//�����带 �����ϱ� ���� ����
	private boolean work=true;//������ �۾��� �纸�ϱ� ���� ����
	//constructor
	//method
	
	@Override
	public void run() {
		while(!stop){
			if(work){//work �� false ���� ��� while ���� ���� ���ǹ��� �ݺ��� �Ұ��
			System.out.println("ThreadA �۾� ��.....");
			}else{
				yield();
			}
		}
		 System.out.println("ThreadA �۾� ����");
	}
	

	public void setStop(boolean stop) {
		this.stop = stop;
	}


	public void setWork(boolean work) {
		this.work = work;
	}

}
