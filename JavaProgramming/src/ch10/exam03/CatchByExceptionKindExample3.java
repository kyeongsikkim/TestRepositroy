package ch10.exam03;

public class CatchByExceptionKindExample3 {
	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println(str.length());// nullpoint Exception

			int[] scores = { 90, 85 };
			for (int i = 0; i < 3; i++) {// Array
				System.out.println(scores[i]);
			}
			String strNum = "a";
			int num = Integer.parseInt(strNum);// number format Exception
		}catch(NumberFormatException e){
			System.out.println("NumberFormatException"); //ĳġ�� ���������� ������� Ȯ���� �Ѵ�.
		} catch (Exception e) {//�̰� ���� ���������� ��� ���� ó���� ���⿡�� �ɸ��� �ȴ�.
			//������ ���� ó���� �ȴ�.
		}
	}
}
