package ch12.exam08;

public class SumThread extends Thread{
	//Field
	private long sum;
	
	
	
	

	public long getSum() {
		return sum;
	}





	//constructor
	//method
	@Override
	public void run() {//1을 더하기 
		for(int i=1;i<=100;i++){
			sum+=i;
		}
	}

}
