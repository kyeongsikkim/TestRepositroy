package homework.ch14.exam6;

public class UsinglocalVariable {
	void method(int arg){//�Ű������� ������ �͵� �����̴�.
		int localVar=40;//�޽��� �ȿ��� ���� �Ȱ͵��� ���� ���� �� �� ����.
		//arg=31;//������ �Ұ��ϴ� �����Լ��� ������ �Ұ��ϴ�.
		//localVar=41;
		//���ٽ�
		MyFunctionalInterface fi=()->{
			//���� ���� �б� 
			System.out.println("arg"+arg);
			System.out.println("localVar"+localVar+"\n");
		};
		fi.method();
	}
}
