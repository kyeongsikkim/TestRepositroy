package ch11.exam03;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		HashMap hashMap=new HashMap();
		
		Key k1=new Key(10);
		Member m1=new Member("blue");
		hashMap.put(k1, m1);
		
		Key k2=new Key(10);
		Member m2=new Member("blue");
		hashMap.put(k2, m2);
		System.out.println(hashMap.size());//����� 2�� ���´� key �� �ؽ� �ڵ尡 �ٸ��� Ű���� ���Ҷ��� 
	}

}


//hash set �� �������� ��ü�� ���� �ϴ� ���� ���Ѵ�.
//hashmap �� Ű������ ���� �����Ѵ�. hash map �� Ű���� �񱳸� �Ѵ�. �ؽ��ڵ带 ���ϰ� equals �� ���ؼ� �񱳸� �Ѵ�.