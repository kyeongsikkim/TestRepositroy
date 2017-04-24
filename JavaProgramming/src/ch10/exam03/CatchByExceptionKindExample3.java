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
			System.out.println("NumberFormatException"); //캐치는 위에서부터 순서대로 확인을 한다.
		} catch (Exception e) {//이게 가장 위에오면은 모든 예외 처리가 여기에서 걸리게 된다.
			//모든것이 예외 처리가 된다.
		}
	}
}
