package ch10.exam04;

import java.io.IOException;

public class ThrowsExample {

	public static void main(String[] args) throws ClassNotFoundException,IOException{
			//throws Exception ����JVM �� �ѱ� ���� �ִ�.JVM �� �ܼ��� �ܼ�â�� ��¸� �ϰ� ������.
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
	static void divide(int x,int y)throws ArithmeticException{//���� throws �� �������� � ���ܰ� �߻��ϴ��� �ϰ� ó���ض� 
		
		int result=x/y;
		
	}
}


