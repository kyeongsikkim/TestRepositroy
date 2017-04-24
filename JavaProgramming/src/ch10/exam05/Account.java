package ch10.exam05;

public class Account {//이 어플리케이션에서만 사용하고 싶은 예외 이런것들을 어플리케이션 예외 내가 어떤 어플리케이션 만드는데 정상실행을 벗어난 예외가 발생할 경우 예외 객체를 만들어서 따로 사용하고 싶다.예외클래스 만들고 쓴다.
	private long balance;
	
	public long getBalnace(){
		return balance;
	}
	public void deposit(int money){
		balance+=money;
	}
	public void withdraw(int money)throws BalanceInsufficientException{//내가 예외처리하지 않고 넘기겠다. 발생하는 것이 아니고 예외 발생을 하면 호출 한곳에서 처리를 해라 
		if(balance<money){
			throw new BalanceInsufficientException("잔고부족");//여기서 예외를 발생시킨다.예외 발생코드  추가적인 것으로 정보를 주는 것도 나쁘지 않다.
		}//메세지를 받을 생성자도 하나있어야 한다.
		balance-=money;
	}
	
}
//사용자 정의 예외를 만드는것 자바에서 제공안해주는 것은 우리가 만들어서 사용해야 된다.
/*public class A{
	int sum;
	void method(){
		class B{
			
			void method1(){
				
			}
		}
	}
}*/