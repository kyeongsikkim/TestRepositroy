package ch11.exam03;

import java.util.HashSet;

public class MemberExample {

	public static void main(String[] args) {
		Member m1=new Member("blue");
		Member m2=new Member("blue");
		
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		//���� ���� ��ü�� �ؽ� �ڵ尡 ��� �ٸ���.
		HashSet hashSet=new HashSet();
		hashSet.add(m1);
		hashSet.add(m2);//������ ���Ƶ� �ؽ��ڵ尡 �ٸ���equals �� �˻���ϰ� �ٷ� ���� �ִ´�. �ؽ��ڵ尡 ���� ���� equals �� Ȯ���ؼ� false �� �־��� ��� �������� �����Ѵ�.
		System.out.println(hashSet.size());
	}

}
