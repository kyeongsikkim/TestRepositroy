package ch10.exam02;

import java.util.Scanner;

public class RuntimeExceptionExample {

	public static void main(String[] args) {//�����Ҷ� �Ű����� ���� ������ ���� �Ȱ����� �迭�� �����Ȱ��� �ƴϴ�.

		try{
	String str=null;
	System.out.println(str.length());//�Լ��̴�.jvm �� ���⼭ �߻��� exception �� ���� �˾� ���� �״����� ���� ó�� ��ü�� ���� e ���ٰ� �ּҰ��� �־��ش�.
		}catch(NullPointerException e){//���ܸ� ��ƶ� ����ó���ϴ� ���̴�. ���ܰ� �߻��ϸ� ��ü�� ���� ��ü�ȿ� ���ܿ� ���� ������ �ִ�. ��ü�� ������ ��� �־��ֳ�
			 
			System.out.println(e.getMessage());//��ü�� ������ �ؼ� get �޼ҵ带 ȣ���ض� ������ �޼����� ���� ���ڿ��� �˷��ش�. nullPointException 
		}finally{//���ܰ� �߻��ϴ� ���ϴ� �����϶�� �ڵ��̴�.
			System.out.println("���������� ����ǵ��� �� ");
		}
		Scanner scanner=new Scanner(System.in);
		while(true){
			
			System.out.print("�Է�:");
			String strNum=scanner.nextLine();
			try{
			int num=Integer.parseInt(strNum);//���ڰ� �ƴ� ���ڸ� ����־��� ��� numberformat exception �� �߻� �� �� �ִ�. NumberFormatException 
		}catch(NumberFormatException e){
			System.out.println("���ڸ� �Է��ϼ���");
		}
		}
	}

}
