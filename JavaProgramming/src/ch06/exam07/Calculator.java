package ch06.exam07;

public class Calculator {
	static String model="MI-84";
	static String makeDay="2017.03.29";
	static String info;//model makeday
	//static 의 복잡한 계산은 static 블록에서 해라
	static{//메소드 영역에 코드가 올라가면 실행이 된다.static 필드의 복잡한 계산을 해준다.
		info=model;
		info+="(";
		info+=makeDay;
		info+=")";
	}
	
}
