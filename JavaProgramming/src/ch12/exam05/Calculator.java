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
			Thread.sleep(2000);//스레드 2초쉬게하는것 
		} catch (InterruptedException e) {
			
		}
		System.out.println((Thread.currentThread().getName())+":"+this.memeory);
	}
}
