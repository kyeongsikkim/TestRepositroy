package ch10.exam06;

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
		e.printStackTrace();//스택안의 내용을 추적해서 프린트하겠다는 뜻이다.개발 할 때 사용을 하는 것이다. catch 안에다가 많이 넣는다. 어디서 예외 처리 됐는지만 알기위해서 넣는다.예외가 어디서부터 시작해서 어디서 종료되었다.
		System.out.println(e.toString());//예외 정보 보는것 e.printstackTrace(),e.getMessage, e.toString();
		System.out.println(e.getMessage());
	}
	System.out.println("잔고:"+account.getBalnace());
	}

}
