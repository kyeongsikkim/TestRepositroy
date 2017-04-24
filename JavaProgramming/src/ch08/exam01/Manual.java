package ch08.exam01;

public interface Manual {//public 붙어 있고 안붙어 있고는 똑같다. 결국은 다 public 이다.
//field
	/*public static final:기본적으로 붙어 있다. */
	String COMPANY="삼성전자";
	int MAX_SPEED=10;
	int MIN_SPEED=10;
//method 인터페이스로 사용할 수 있는 객체 인터페이스를 구현한 객체 인터페이스로 사용 가능한 객체가 있는데 최소한 인터페이스에 있는 내용을 가지고 있어야한다.
	//인터페이스를 구현한 객체
	/*public abstract:메소드는 기본적으로 붙어있다.*/
	void turnOn();//리턴값 없다.매개값없다.
	void turnOff();//리턴값 없다. 매개값없다.
	void setSpeed(int speed);//매개 값이 있다.
	int getSpeed();//매개값 없고 리턴값 있다.설명서 
	void run();//매개값없고  리턴값 없다// 인터페이스는 디폴트로 퍼블릭이 항상 붙는다. 
//interface 는 생성자를 안갖는다.
}
