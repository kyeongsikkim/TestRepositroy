package ch11.exam04;

public class Member {
//Field
	private String id;
	public Member(String id){
		this.id=id;
	}
	//������ �Ѵ�.
	@Override
	public String toString() {
		return "Member [id=" + id + "]";
	}
}

//�̰��� obj �� ���� ��� ���� ���̴�.
//syso(); �����Ǵ� ������ ����� �޾Ƽ� ����ϴ°��̴�.