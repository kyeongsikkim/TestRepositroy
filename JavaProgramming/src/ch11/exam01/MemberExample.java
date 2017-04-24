package ch11.exam01;

public class MemberExample {

	public static void main(String[] args) {
		Member m1=new Member("blue");
		Member m2=new Member("blue");
		
		System.out.println(m1==m2);//object 는 번지를 가지고 있다.
		System.out.println(m1.equals(m2));//논리적 동등 비교를 위한 것이다. String 끼리 비교를 할때는 그렇게 된다.
	
	}

}
