package ch11.exam01;

public class MemberExample {

	public static void main(String[] args) {
		Member m1=new Member("blue");
		Member m2=new Member("blue");
		
		System.out.println(m1==m2);//object �� ������ ������ �ִ�.
		System.out.println(m1.equals(m2));//���� ���� �񱳸� ���� ���̴�. String ���� �񱳸� �Ҷ��� �׷��� �ȴ�.
	
	}

}
