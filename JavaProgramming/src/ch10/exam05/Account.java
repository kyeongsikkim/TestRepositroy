package ch10.exam05;

public class Account {//�� ���ø����̼ǿ����� ����ϰ� ���� ���� �̷��͵��� ���ø����̼� ���� ���� � ���ø����̼� ����µ� ��������� ��� ���ܰ� �߻��� ��� ���� ��ü�� ���� ���� ����ϰ� �ʹ�.����Ŭ���� ����� ����.
	private long balance;
	
	public long getBalnace(){
		return balance;
	}
	public void deposit(int money){
		balance+=money;
	}
	public void withdraw(int money)throws BalanceInsufficientException{//���� ����ó������ �ʰ� �ѱ�ڴ�. �߻��ϴ� ���� �ƴϰ� ���� �߻��� �ϸ� ȣ�� �Ѱ����� ó���� �ض� 
		if(balance<money){
			throw new BalanceInsufficientException("�ܰ����");//���⼭ ���ܸ� �߻���Ų��.���� �߻��ڵ�  �߰����� ������ ������ �ִ� �͵� ������ �ʴ�.
		}//�޼����� ���� �����ڵ� �ϳ��־�� �Ѵ�.
		balance-=money;
	}
	
}
//����� ���� ���ܸ� ����°� �ڹٿ��� ���������ִ� ���� �츮�� ���� ����ؾ� �ȴ�.
/*public class A{
	int sum;
	void method(){
		class B{
			
			void method1(){
				
			}
		}
	}
}*/