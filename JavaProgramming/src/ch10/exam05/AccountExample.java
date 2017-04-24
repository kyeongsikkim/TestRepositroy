package ch10.exam05;

public class AccountExample {
	
	public static void main(String[] args) {
	Account account =new Account();
	System.out.println("잔고:"+account.getBalnace());
	account.deposit(100000);
	System.out.println("잔고:"+account.getBalnace());
	try {//클래스에 throws 있으면 호출한 쪽에서 처리해야 된다.
		account.withdraw(10000000);
	} catch (BalanceInsufficientException e) {
		//예외처리 코드 
		System.out.println(e.getMessage());
	}
	System.out.println("잔고:"+account.getBalnace());
	}

}
