package ch11.exam10;

public class StringLengthExample {
	public static void main(String [] args){
		String ssn="7306241230123";
		int length=ssn.length();
		int []x=new int[3];
		if(length==13){
			System.out.println("�ֹι�ȣ �ڸ����� �½��ϴ�");
		}else{
			System.out.println("�ֹι�ȣ �ڸ����� Ʋ���ϴ�");
		}
		String subject="�ڹ� ���α׷���";//�ܾ ������ ���� ���Ѵ�. ���� ������ ã���� �װ��� ó�� �����ϴ� ���� �ε����� �˷�����Ѵ�. 
		int location=subject.indexOf("���α׷���");
		System.out.println(location);
	}
}
