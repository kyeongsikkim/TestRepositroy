package ch05.exam02;

public class ArrayExample02 {
	public static void main(String[] args) {// ����ִ� ��ü�� ���´�.
		int[] v1={10,20,30};//�����Ϸ��� �迭�� ���̰� ��ŭ �Ǵ��� Ȯ���� ����� �Ѵ�. �迭�� ���̸� ���� �����Ѵ�.
		System.out.println(v1);
		
		int[]v3=new int[3];
		v3[0]=10;
		int[]v2;//��ü�� �����Ҷ� ���� ��ŭ �Ǵ��� �𸥴�.
		String num=null;
		System.out.println(num);
		//v2={10,20,30}//�迭 �� ���̸� ���� ������ ���־�� �Ѵ�.
		v2=new int[]{10,20,30};//���ο� ��ü �迭�� ���� ���Խ����� ���� �����ϴ�.
		System.out.println(v2);
		int result=sum(v1);
		int result2=sum(v2);
		//sum({10,20,30});�迭�� ���� ���� ������ �����ϰ� ���� ���� ���� �ȵ�����. ������ ������ �� ���� �־���� �Ѵ�. ���� �־��ְ� ���� ��쿡�� new int [] �迭�� ���Ӱ� ����� �ش�.
		sum(new int[]{10,20,30});
		System.out.println(result);
		System.out.println(result2);
	}
	public static int sum (int[]v2){//�������� ���� �޴´�.
		int sum=0;//������ ���� �� �� ������ ������ �ȴ�.
		for(int i=0;i<v2.length;i++){
			//sum=sum+v2[i];//������ �ΰ� 
			sum+=v2[i];//������ �ϳ� �ڹ� �� �Ȱ��� �Ѵ�.
		}
		return sum;
}
}