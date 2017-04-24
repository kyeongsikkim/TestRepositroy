package ch11.exam10;

public class StringLengthExample {
	public static void main(String [] args){
		String ssn="7306241230123";
		int length=ssn.length();
		int []x=new int[3];
		if(length==13){
			System.out.println("주민번호 자리수가 맞습니다");
		}else{
			System.out.println("주민번호 자리수가 틀립니다");
		}
		String subject="자바 프로그래밍";//단어가 완전히 같나 비교한다. 같은 내용을 찾으면 그곳의 처음 시작하는 곳의 인덱스를 알려줘야한다. 
		int location=subject.indexOf("프로그래밍");
		System.out.println(location);
	}
}
