package ch11.exam01;

public class Member {
//Field
	private String id;
//constructor
	public Member(String id){
		this.id=id;
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
