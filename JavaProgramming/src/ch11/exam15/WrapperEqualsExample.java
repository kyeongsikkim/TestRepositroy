package ch11.exam15;

public class WrapperEqualsExample {

	public static void main(String[] args) {
		/*Integer v1=new Integer(10);
		Integer v2=new Integer(10);*/
		
		Integer v1=1000;
		Integer v2=1000;//-127���� ~128 �� ������ �ȵ����� ���̻��� �ȵȴ�.
		
		//System.out.println(v1==v2);//�⺻Ÿ���� �ƴҰ�� ���񱳷� ==�� ������� ���� 
		//System.out.println(v1.intValue()==v2.intValue());//true
		System.out.println(v1.equals(v2));//equals �� ������ 
	}

}
