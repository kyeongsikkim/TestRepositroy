package ch05.exam02;

public class ArrayExample01 {
	public static void main(String[]args){//����ִ� ��ü�� ���´�.
		int[] v1={80,90,87};
		int[] v2={80,90,87,70};//�ΰ��� �ٸ� ��ü�̴�.
		String[] v3={"Java","Program"};
		
		System.out.println(v1);//�ּҰ��� ���´�.
		System.out.println(v2);//�ּҰ��� ���´�.
		System.out.println(v1==v2);//�������� �ּҰ��� ���ϴ� �ű� ������ ���� �ٸ��� ���´�.
		System.out.println(v1[0]==v2[0]);
		System.out.println(args.length);
		System.out.println(v1.length);//()���� �����ʵ� ()�ִ� ���� �޼ҵ� �� ����.
		System.out.println(v2.length);
		System.out.println(v3.length);
		
		int v4=v1[0]+v1[1]+v1[2];
		int v5=0;
		for(int i=0;i<v1.length;i++){//�������� ;���ǹ�; ������
			v5+=v1[i];
		}
		
	}
}
