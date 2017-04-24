package ch09.exam07;

public class Example2 {// A클래스 안에 있는B로 구현이 가능하다.
	public static void main(String[] args) {
/*		// 로컬 클래스를 정의하고 객체 생성
		class CImpl implements A.C {
			@Override
			public void cMethod() {
				System.out.println("CImpl-cMehtod()");
			}
		}
		A.C c = new CImpl();*/
	A.C c=new A.C(){//c인터페이스 사용가능한 객체를 만드는것 
		@Override
		public void cMethod() {
			System.out.println("CImpl-cMehtod()");
		}
	};//구현 클래스를 만든다음에 CImpl
	}
}
