package ch15.exam07;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		//Set<Integer>set=new TreeSet<Integer>();//�θ𿡰� ����Ȱ͸� ��밡���ϴ�. set interface ������ �Ѱ��̴�. ������ ������ �Ȱ��� ����� �� �ִ�.comparable
		TreeSet<Person>set=new TreeSet<Person>();//Collections.reverseOrder() ū�� ���������� �ȴ�.��������������
		//treeset �� �񱳸� �ؾ� �Է��� �Ѵ�.treeset �� �ܺο��� ���ڸ� ��������� �Ѵ�. 
		set.add(new Person("ȫ�浿",45));
		set.add(new Person("���ڹ�",25));
		set.add(new Person("������",31));

		
		for(Person p:set){//�ø����� ��ü���ȴ�. 
			System.out.println(p.getName()+p.getAge());
		}
	}

}
/*
 *comparable �� �񱳱���� �ִ� ��ü  
 */
