package ch05.exam01;

public class NullPointerException {

	public static void main(String[] args) {
		int[]scores=null;//�迭�� ������ �ȵƴ�. ������ ������ �Ǿ���.

		//System.out.println(scores[0]);
		//System.out.println(scores);//�������� ������ ���̴�.���ÿ� �ִ� ������ ���� ����ϴ� ���̴�. 
		String name=null;//��ü�� ������ �ȵ� ���¿��� ������ ��������� ���̴�.null �� �־��� ��� 
		
		System.out.println(name.length());//������ �����ϰ��ִ� ��ü�� ���� ���̸� �����ض� �׷��� ���� ����Ű�� ��ü�� �����Ƿ� nullexception �� ���´�. ����Ҷ��� �Լ��� ȣ���Ѵ�.
		//name.length(); name �� �����ϴ� ��ü�� ���� length() ��� �Լ��� ȣ���ض�  
		// . �� ��ü ���� �����ڶ�� �Ѵ�. String v1=(��ü�� ������ �������� v1 �� �־��ش�.)null �� �ð�� ��ü�� ������ ���Ѵ�.
		//char Ÿ���� ���� Ÿ�� �̴�. '," �� �ٸ� ǥ���̴�. ""���ڿ� Ÿ������ �����Ѵ�.
		//String v2="��"
	}

}
