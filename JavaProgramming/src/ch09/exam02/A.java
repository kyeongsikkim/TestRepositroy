package ch09.exam02;

public class A {
	
	int aField;
	
	A(){
	
	class D{
	}//������ �ȿ� Ŭ������ ���� �� �ִ�.
	class E{}//���� ������ ��Ͼȿ��� ����� ���� �ٸ� ��Ͽ����� ������ �ǵ� �ȴ�. �׷��� ���⼭ Ŭ���� ���� �̸� ��밡��
	}
	
	
	void method(){
	class D{
		void dMethod(){
		aField=10;
		}
	}//������ �ȿ� Ŭ������ ���� �� �ִ�.
	class E{
		void EMethod(){
			aField=10;
			}
	}
	}
	//nested class ��ø ��� Ŭ����
	class B{
	}//A���� B�� ����� ������. A�� ���� ��� B �� �ʿ䰡 ����.�̷����

	static class C{
		void cMethod(){
			//aField=10; (x);//�ν��Ͻ� �ʵ�� ������ ����� �Ұ��ϴ�.
		}
	}//C ���� ���� A �������� ������ �ƴϴ� A�� ������ ���õ� ���̴�.
	}

