package ch11.exam03;

public class Member {
//Field
	private String id;
//constructor
	public Member(String id){
		this.id=id;
	}
	@Override
		public int hashCode() {
		return id.hashCode();//���ڿ��� ������ �ؽ��ڵ尡 ���ٰ� ���´�. ��ü�� �����ؼ� �ؽ��ڵ带 ����.
	}
//Method
	@Override//�������̵� ������ ������ object �� ���� ����� �޾ұ� ������ obj �� �޼ҵ带 ������ ������ ���̴�.extends �� �׻� ����� �Ȱ��̴�. 
		public boolean equals(Object obj) {
		if(obj instanceof Member){//obj �� ���°��� ������� Ȯ�� �ֳ��ϸ� ��� ��ü�� �ٹ޾� ���ϼ� �ִ�. 
			Member target=(Member)obj;
			if(id.equals(target.id)){
				return true;
			}
		}
		return false;
	}
}
//�̰��� obj �� ���� ��� ���� ���̴�.
