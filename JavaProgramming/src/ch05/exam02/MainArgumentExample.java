package ch05.exam02;

public class MainArgumentExample {

	public static void main(String[] args) {//�迭 ������ ���´�.
		if(args.length==2){
			String v1=args[0];
			int intv1=Integer.parseInt(v1);//integer.parseInt �� ���ڸ� ���ڷ� �ٲ��ִ°� 
			String v2=args[1];
			int intv2=Integer.parseInt(v2);
			System.out.println(intv1+intv2);
		}else{
			System.out.println("�ΰ��� ���� �Ű� ���� �ʿ��մϴ�.");
		}
		
		//ch05.exam02.MainArgumentExample//��Ű���� �ִٸ� Ǯ�������� Ŭ���� ��ü�� �Ǵ� ���̴�.�� ��Ű�� ó�� ���� ������ �ؾ� Ŭ������ �Ǵ� ���̴�. 
		//.class �ִ� ������ ������ ���Ѿ� �ϹǷ� bin ���� ����.�������Ʈ���� �����Ҷ��� ��Ű�� �̸� ���� �����ؼ� ������ ���Ѿ� Ŭ������ �ȴ�.
	}

}
