package ch05.exam02;

public class ArrayExample03 {
	public static void main(String[] args) {// ����ִ� ��ü�� ���´�.
		int[] v1=new int[5];//���� default �� �� �ִ� 5��¥�� �迭�� ���� ���� ������ �ϰڴ�. new �� ���ؼ� ���ο� �迭�� ���� �ִ´�.
		v1[0]=10;
		v1[2]=10;
		
		//�������� ��ü�� �����ؼ� ��ü�� ������ �ִ� �������� ���� ������ ���� �����ش٤�.
		//boolean[]v2=new boolean[5];//�迭�̱� ������ ���� Ÿ���̴�.
		
		String[]v2=new String[5];//�� null �� �Ǿ��ֳĸ� ����Ű�� �ּҰ� ��� �迭�� �� �� ����� ������� ������ ����� ����. 
		v2[0]="JAVA";
		v2[1]="1";
		/*String[]v3;//�迭�� ������ �� ���� �־��ִ��� ���̸� ������ ������� �Ѵ�. 
		v3[0]="Java";//�׷��� �ʰ� ���� ���� ������ ������ ����.
*/		
		System.out.println(v2);
		System.out.println(v2[0]);
		System.out.println(v1[0]==v1[2]);
		System.out.println(v2[0]==v2[2]);
		
	}
}