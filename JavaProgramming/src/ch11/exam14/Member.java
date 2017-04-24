package ch11.exam14;

public class Member implements Comparable<Member>{//member �� comparable �� ������ ��ų �� �־�� �Ѵ�. comparable �� interface �̱� ������ �ϴ� Member �� ������ �ؾ� �ȴ�.Member ���� ���ؾ� �ȴ�.
private String name;
private int age;

public Member(String name,int age){
	this.name=name;
	this.age=age;
}
@Override
	public String toString() {
		return name+"-"+age;
	}

@Override
public int compareTo(Member o) {
	//return Integer.compare(age,o.age);
	//return age-o.age;//String �� ���� �ִ� �� ���������� ����������
	//return name.compareTo(o.
	if(age<o.age){
		return -1;
	}else if(age==o.age){
		return 0;
	}else{
		return 1;
	}
}
}
