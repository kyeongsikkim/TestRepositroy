package ch11.exam09;

public class StringConstructorExample  {
	public static void main(String []args)throws Exception{
		String s1="abc";
		String s2=new String("abc");
		
		char []charArray={'a','b','c'};//char �迭�� �Ű������� ���°� ������ ���� ������ �ȴ�.
		String s3=new String(charArray);
		
		byte[]byteArray={49,50,51};//byte �� �ִ°� ������ �־��ָ� �ȴ�.
		String s4=new String(byteArray);//Ű�ڵ� ���� ���´� ���ڷ� ��ȯ�Ǿ ��Ʈ������ ����� �ȴ�.49 �� 1,50=2,51=3 �ΰ��̴�. ���º�ȯ�Ҷ��� ������

		System.out.println(s3);
		byte[] inputData=new byte[100];//byte �迭�� �޴°� �մµ� ��� ���� ���ڿ��� ���� ������ �ʰ� �Ϻκи� ���ڿ��� ���鱸 ���� �� ����Ѵ�.
		int readByteNo=System.in.read(inputData);//������ ���� ó�� ����� �Ѵ�. byte �迭�� ������ ��ü�� �о��.���⼭ hello �ϰ�� ���������ؼ� 8�� ��ȯ�� �Ǿ�����.
		//8�̸����Ѵ� hello ���� Ű����� hello �� ġ�� ���͸� ĥ ��� 100���� byte �����ִ� �迭�� �����ߴ�. �迭���� Ű�ڵ尡 ����
		//�� 8���� ���� �ȴ�. hello �� ������ ���ؼ���  ����Ʈ �迭�� ù��° �Ű������� �ش� ��ü�� �ش� 0���� �� ���ڰ� �� �ִ� ������ �Ѵ�.
		//���ڰ� ���������� �ʱ� ������  system.in.read �� ������ ���� ����Ʈ ���� �����Ѵ�. ���������� ����ٶ�¶� �̰��� ���� �Է�����  ������ ���� 
		//�о ���� ����Ʈ ���� �������ش�. ���� �����ڸ� ã�´� �״������޼ҵ带 ã�´�.
		 String strData=new String(inputData,0,readByteNo-2);//0���� ������ �ؼ� (int length) �������� length
	
		 byte[]byteArray2={49,50,51,52,53,54};
		String strData2=new String(byteArray2,3,3);
		System.out.println(strData2);
	}
}
