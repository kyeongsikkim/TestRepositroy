package ch11.exam13;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		String regExp="(02|010)-\\d{3,4}-\\d{4}";//�������ð� �ΰ� ���� ���� �������� t �������� n �̷��͵��� ���ڿ��� ǥ���� �˰� ������ �������ø� �ϳ� ���ٿ��ش�.�ϳ��� ���ڷ� �޾Ƶ��̰ڴٸ� �������ø� �ٿ��ش�.
		String data="010-123-4567";
		
		boolean result=Pattern.matches(regExp,data);
		if(result){
			System.out.println("���Խİ� ��ġ�մϴ�");
		}else{
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�");
		}
		
		regExp="\\w+@\\w+\\.\\+(\\.\\w+)?";
		data="angel@naver.com";
		result=Pattern.matches(regExp, data);
		if(result){
			System.out.println("���Խİ� ��ġ�մϴ�");
		}else{
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�");
		}
	}

}
