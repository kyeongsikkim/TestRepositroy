package ch10.exam06;

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
			throw new BalanceInsufficientException("�ܰ����");//���⼭ ���ܸ� �߻���Ų��.���� �߻��ڵ�  �߰����� ������ ������ �ִ� �͵� ������ �ʴ�.���� ó�� �޼��� ���� ����Ѵ�.
		}//�޼����� ���� �����ڵ� �ϳ��־�� �Ѵ�.
		balance-=money;
	}
	
}
//����� ���� ���ܸ� ����°� �ڹٿ��� ���������ִ� ���� �츮�� ���� ����ؾ� �ȴ�.
//8��Ȯ�� ���� 9�� ��ü ���� Ȯ�� ���� 10�� Ȯ�ι��� 