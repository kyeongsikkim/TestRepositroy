package ch10.exam01;

public class RuntimeExceptionExample {

	public static void main(String[] args) {//실행할때 매개값을 주지 않으면 선언만 된것이지 배열이 생성된것은 아니다.

	/*String str=null;
	System.out.println(str.length());//함수이다.
*/	
		/*String []arr={"a","b"};
	String data=arr[2];//배열의 사이즈를 벗어난 것이다.
*/	
		//예외가 발생하면 바로 시스템 종료가 된다.
//	int num=Integer.parseInt("a100");
		/*Animal animal=new Dog();
		Dog dog=(Dog) animal;
		Cat cat=(Cat) animal;*/ 
	
		//int keycode=System.in.read();//IoException 이 발생할 수도 있으니까 예외처리를 해라 일반예외이다.
	}

}
