package ch11.exam06;

public class Member {
//Field
	private String id;
	public Member(String id){
		this.id=id;
	}
	//������ �Ѵ�.
	@Override
	public String toString() {
		return id;
	}
	
	@Override
		protected void finalize() throws Throwable {
		System.out.println(id+"�� ���ŵ�");
	}
}

//�̰��� obj �� ���� ��� ���� ���̴�.
//syso(); �����Ǵ� ������ ����� �޾Ƽ� ����ϴ°��̴�.