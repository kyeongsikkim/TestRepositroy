package ch15.exam03;

public class Member {
	public String name;
	public int age;

	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		return name.hashCode()+age;//�ᱹ�� �ΰ��� ���� �ؽ� �ڵ尡 ������ȴ�. 
	}
	@Override
	public boolean equals(Object obj) {//������Ʈ�� equals �� ���� ��ü �� ���� �ٸ��ĸ� �Ǵ��� �Ѵ�.
		if(obj instanceof Member){
			Member member=(Member)obj;//���� ���� �� ��ȯ�� ������� �Ѵ�.
			if(name.equals(member.name) && member.age==age){//������ �� �Ҷ��� equals�� ����Ѵ�. hashset ������ �ִ� �̸��� ���� ���̶� �񱳸� �Ѵ�.
				return true;
			}
		}
		return false;
	}
}
