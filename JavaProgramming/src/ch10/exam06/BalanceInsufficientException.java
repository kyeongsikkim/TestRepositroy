package ch10.exam06;

public class BalanceInsufficientException extends Exception{//런타임 받고 싶으면 RunException 으로 한다 컴파일러가 예외 처리 할것이면 Exception 으로 컴파일러 체크 안하면 RuntimeException 으로 한다.
//하나는 생성자를 만들어주고 
public BalanceInsufficientException(){
	super();//자동으로 생략이 되어있다. Exception 기본적으로 만든다.
}
public BalanceInsufficientException(String message){
	super(message);
}
}
//우리가 원하는 Exception 을 받고 하나는 기본생성자 하나는 메세지를 받게 된다. 