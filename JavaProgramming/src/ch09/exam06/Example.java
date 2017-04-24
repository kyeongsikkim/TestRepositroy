package ch09.exam06;

public class Example {//A클래스 안에 있는B로 구현이 가능하다.
	public static void main(String[] args) {
		//로컬 클래스 생성한뒤에 인터페이스
		class C implements A.B{
			@Override
		public void method() {
				System.out.println("안녕 ");
				// TODO Auto-generated method stub
				
			}
		}
		
	}

}
