package ch05.exam01;

public class CallByValueAndCallByReference {
	public static void main(String[] args) {
		int v1=10;
		int v2=20;
		int v3=sum(v1,v2);
		
		System.out.println("V1:"+v1);//������� ����� �� �� ���ְ� ���ڿ� ���� ��ɵ� ������ �ִ�.�Ѵ� �����϶��� ��� �����̶� ���ڸ� ���ڿ� �������Ͼ��.
		System.out.println("V2:"+v2);
		System.out.println("v3:"+v3);
		int []v4={10,20};
		System.out.println("V4[0]:"+v4[0]);//������� ����� �� �� ���ְ� ���ڿ� ���� ��ɵ� ������ �ִ�.�Ѵ� �����϶��� ��� �����̶� ���ڸ� ���ڿ� �������Ͼ��.
		System.out.println("V4[1]:"+v4[1]);
		int v5=sum(v4);
		System.out.println("V4[0]:"+v4[0]);//������� ����� �� �� ���ְ� ���ڿ� ���� ��ɵ� ������ �ִ�.�Ѵ� �����϶��� ��� �����̶� ���ڸ� ���ڿ� �������Ͼ��.
		System.out.println("V4[1]:"+v4[1]);
		System.out.println("v5:"+v5);//���� Ÿ���̱� ������ ���� �ٲ� �� �ִ�.
	}
public static int sum(int x,int y){
	x=30;
	y=40;
	return (x+y);
}
public static int sum(int []scores){//���� �迭�� ���� ���� ���ñ�?�������� ���´�.�Ȱ��� �迭�� �����ϹǷ� ���ʿ��� �����ص� ���Ѵ�.
	int sum=0;
	scores[0]=30;
	scores[1]=40;
	for(int i=0;i<scores.length;i++){
		sum+=scores[i];
	}
	return sum;
}
}
