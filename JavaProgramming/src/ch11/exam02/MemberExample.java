package ch11.exam02;

public class MemberExample {

	public static void main(String[] args) {
		Member m1=new Member("blue");
		Member m2=new Member("blue");
		
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		//따라서 개별 객체는 해시 코드가 모두 다르다.
	}

}
