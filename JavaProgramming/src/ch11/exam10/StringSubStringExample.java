package ch11.exam10;

public class StringSubStringExample {

	public static void main(String[] args) {
		String ssn="880815-1234567";
		String firstNum=ssn.substring(0, 6);//0부터 6앞까지 나타낸다.
		{
			System.out.println(firstNum);
		}
		
		String secondNum=ssn.substring(7);//이지점부터 끝까지
		System.out.println(secondNum);
	}

}
