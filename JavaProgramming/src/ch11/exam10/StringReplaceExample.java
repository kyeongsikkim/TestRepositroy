package ch11.exam10;

public class StringReplaceExample {
	public static void main(String[]args){
		String oldStr="자바는 객체지향언어 입니다. 자바는 풍부한API 지원합니다.";//객체가 한번 생성이 되면은 내용이 바뀌지 않는다.
		String newStr=oldStr.replace("자바", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}
