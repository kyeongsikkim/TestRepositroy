package ch11.exam04;

import java.util.HashSet;

public class MemberExample {

	public static void main(String[] args) {
		Member m1=new Member("blue");
		System.out.println(m1.toString());//object �� ���� �ִ� toString();
		System.out.println(m1);//�̷���� .toString �� �ڵ����� ȣ���ϰ� �ȴ�.
		String result=m1+"good";//�����϶��� ���ڰ����� �Ѵ�. 
		System.out.println(result);
	}

}
