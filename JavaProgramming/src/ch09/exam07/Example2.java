package ch09.exam07;

public class Example2 {// AŬ���� �ȿ� �ִ�B�� ������ �����ϴ�.
	public static void main(String[] args) {
/*		// ���� Ŭ������ �����ϰ� ��ü ����
		class CImpl implements A.C {
			@Override
			public void cMethod() {
				System.out.println("CImpl-cMehtod()");
			}
		}
		A.C c = new CImpl();*/
	A.C c=new A.C(){//c�������̽� ��밡���� ��ü�� ����°� 
		@Override
		public void cMethod() {
			System.out.println("CImpl-cMehtod()");
		}
	};//���� Ŭ������ ��������� CImpl
	}
}
