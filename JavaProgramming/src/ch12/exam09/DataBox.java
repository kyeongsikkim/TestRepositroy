package ch12.exam09;

public class DataBox {
	//Field
	private String data;//데이타를 저장 하는 실제 위치 
	//constructor
///////////////////////////////////////다른스레드 //////////////////////////////////////////////////////////////////////
	public synchronized String getData() {
		if(data ==null){
			try {
				wait();
			} catch (InterruptedException e) {
			
			} //읽을게 없으니까 wait 으로 빠지게 한다.
		}
		String returnValue=data;
		System.out.println("읽은데이터:"+returnValue);
		data=null;
		notify();
		return returnValue;
		}
		
	
////////////////////////////////////////다른 스레드////////////////////////////////////////////////////////
	public synchronized void setData(String data) {
		if(this.data!=null){
			try {
				wait();
			} catch (InterruptedException e) {
			
			} //읽을게 없으니까 wait 으로 빠지게 한다.
		}
		this.data = data;
		System.out.println("생성데이터:"+data);
		notify();
	}
	
	//method
	
}
