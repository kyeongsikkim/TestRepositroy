package ch12.exam09;

public class DataBox {
	//Field
	private String data;//����Ÿ�� ���� �ϴ� ���� ��ġ 
	//constructor
///////////////////////////////////////�ٸ������� //////////////////////////////////////////////////////////////////////
	public synchronized String getData() {
		if(data ==null){
			try {
				wait();
			} catch (InterruptedException e) {
			
			} //������ �����ϱ� wait ���� ������ �Ѵ�.
		}
		String returnValue=data;
		System.out.println("����������:"+returnValue);
		data=null;
		notify();
		return returnValue;
		}
		
	
////////////////////////////////////////�ٸ� ������////////////////////////////////////////////////////////
	public synchronized void setData(String data) {
		if(this.data!=null){
			try {
				wait();
			} catch (InterruptedException e) {
			
			} //������ �����ϱ� wait ���� ������ �Ѵ�.
		}
		this.data = data;
		System.out.println("����������:"+data);
		notify();
	}
	
	//method
	
}
