package ch05.exam01;

public class NullExample {

	public static void main(String[] args) {
		String v1=null;//������ �����Ǳ����ؼ��� ���� �־�� �Ѵ�. null ���� �� ���� ���̵� ������ String ��ü�� ������ �Ȱ��� �ƴϴ�. ������ �������� ����Ű�� ��ü�� ����. 
		
		String v2;
		v2=null;//�̽������� ������ ������ �Ǵ°��̴�.��ü�� �����Ǵ� ������ ������ ���� ���� ���� ���̴�. �⺻Ÿ���� null �� �ȵ��� ���� ������ ���������� �ȵȴ�.
		
		int[]v3=null;//���� Ÿ���� �Ȱ��� �����̴�.�迭�� ������ �Ȱ��� �ƴϴ�.
		System.out.println(v2);
		if(v3==null){
			System.out.println("null");
		}else if(v3!=null){
			System.out.println("not null");
		}
	}

}
