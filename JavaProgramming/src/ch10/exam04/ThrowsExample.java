package ch10.exam04;

import java.io.IOException;

public class ThrowsExample {

	public static void main(String[] args) throws ClassNotFoundException,IOException{
			//throws Exception 으로JVM 에 넘길 수도 있다.JVM 은 단순히 콘솔창에 출력만 하고 끝난다.
		try{
			Class.forName("");//classNotFoundException
			System.in.read();//IoException
		}catch(Exception e){
			
		}
		try{
		divide(10,0);
		}catch(ArithmeticException e){
			
		}
	}
	static void divide(int x,int y)throws ArithmeticException{//보통 throws 를 던질때는 어떤 예외가 발생하는지 니가 처리해라 
		
		int result=x/y;
		
	}
}


