package ch05.exam01;

public class CompareValueExample {
	public static void main(String[] args) {
		int v1=10;
		int v2=20;
		System.out.println(v1==v2);
		
		int []v3={10};//���� Ÿ���� ������ ��ü�� �����Ѵ�. �� ���ÿ� �������� �����Ѵ�.
		int []v4={10};
		System.out.println(v3[0]==v4[0]);//���� �迭�� ���� ���ϴ� ���̴�.
		System.out.println(v3==v4);//stack �ȿ� �ִ� ������ ���� ���ϴ� ���̴�. �� �������� ���Ѵ�.  
		v4=v3;//v3�� �������� v4�� ����ִ´� �� ���� �迭 ��ü�� ����Ű�� �Ѵ�.
		String name=new String("�ſ��");//new�� ���̸� ���Ӱ� ������ �׷����̴�.
		String name1=new String("�ſ��");//���� ��ü�� ����Ų��.���ͷ����� :Ű����� �Է��Ѱ��� ���Ѵ�.
		System.out.println(v3==v4);//v3�� v4�� ���� �迭�̳� ���� ��ü�� ����Ű�� �ִ� ���̳�
		//�Ȱ��� ���ڿ��� �Է��Ѵٸ� String ��ü�� �����Ѵ�.
		System.out.println(name==name1);
		 System.out.println(name.equals(name1));//������ �� �Ҷ� ����Ѵ�.
	}

}
