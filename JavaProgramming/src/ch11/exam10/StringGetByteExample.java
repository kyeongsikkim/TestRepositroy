package ch11.exam10;

import java.io.UnsupportedEncodingException;

public class StringGetByteExample {
	public static void main(String []args){
		//����� �� �ѹ���Ʈ�� ���ڵ��� ������EUC-KR �� ����  �ѱ��� 2����Ʈ UTF-8�� �ѱ��� 3byte �� �Ѵ�.
		String str="�ȳ��ϼ���";//2byte �� �о �׷��� ���´�.
		//����� �ѹ���Ʈ �ѱ��� 2byte  MS949    EUC-KR 
		byte[]bytes1=str.getBytes();//���ڿ��� byte �� ���� �����Ѱ��̴�. 
		System.out.println("bytes1.length:"+bytes1.length);
		String str1=new String(bytes1);
		System.out.println("bytes1->String:"+str1);//byte �� ���� ���·�  
		//���ڵ� ���´� �����͸� �����Ҷ� byte �� �ٲٴ� ���̴� ���ڵ��� byte�� ���� ���·� �ٲٴ� �� 
		
		try{
		byte[]bytes2=str.getBytes("EUC-KR");//������ ����//���� � ������� ���� ���ΰ�. �������� �ʴ� ���ڸ� ���� �־��� ��� ���ڸ� ��ȯ ��ų ������.
		System.out.println("bytes2.length:"+bytes2.length);
		String str2=new String(bytes2,"EUC-KR");
		System.out.println(str2);
		
		
		byte[]bytes3=str.getBytes("UTF-8");//���� ���� ��� �о� ���� ���̳�. UTF-8 �� ���·� �ٲ��ش�.
		System.out.println("bytes3.lenght"+bytes3.length);
		String str3=new String(bytes3,"UTF-8");
		System.out.println(str3);
		}catch(UnsupportedEncodingException e){//�������� �ʴ� ���ڵ��� ����� ��� 
			e.printStackTrace();//���ܰ� ��� �߻��ϴ��� ������ �ؼ� ������ִ°� 
		}
	}
	
	
	
}
