package ch10.exam05;

public class AccountExample {
	
	public static void main(String[] args) {
	Account account =new Account();
	System.out.println("�ܰ�:"+account.getBalnace());
	account.deposit(100000);
	System.out.println("�ܰ�:"+account.getBalnace());
	try {//Ŭ������ throws ������ ȣ���� �ʿ��� ó���ؾ� �ȴ�.
		account.withdraw(10000000);
	} catch (BalanceInsufficientException e) {
		//����ó�� �ڵ� 
		System.out.println(e.getMessage());
	}
	System.out.println("�ܰ�:"+account.getBalnace());
	}

}
