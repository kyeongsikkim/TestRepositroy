package ch12.exam05;

public class Calculator {
// Field
	private int memeory;
//constructor

	
	//Method

	public int getMemeory() {
		return memeory;
	}

	public synchronized void setMemeory(int memeory) {
		this.memeory = memeory;
		try {
			Thread.sleep(2000);//������ 2�ʽ����ϴ°� 
		} catch (InterruptedException e) {
			
		}
		System.out.println((Thread.currentThread().getName())+":"+this.memeory);
	}
}
