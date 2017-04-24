package homework.ch14.exam6;

public class UsinglocalVariable {
	void method(int arg){//매개변수로 들어오는 것도 로컬이다.
		int localVar=40;//메스드 안에서 선언 된것들은 값을 변경 할 수 없다.
		//arg=31;//변경이 불가하다 로컬함수는 변경이 불가하다.
		//localVar=41;
		//람다식
		MyFunctionalInterface fi=()->{
			//로컬 변수 읽기 
			System.out.println("arg"+arg);
			System.out.println("localVar"+localVar+"\n");
		};
		fi.method();
	}
}
