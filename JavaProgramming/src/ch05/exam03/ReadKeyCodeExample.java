package ch05.exam03;

import java.io.IOException;

public class ReadKeyCodeExample {
	//JVM �� ȣ���� �ϰ� �ȴ�.JVM �� �ܼ��� ��¸� �ϰ� ������ �Ѵ�.
	public static void main(String[] args)throws Exception {
		int keycode=0;
		System.out.println("------------------------------------");
		System.out.println("1.���� |2.�б�| 3.���� ");
		System.out.println("------------------------------------");
		
		while(true){
		
		
		if(keycode!=13 && keycode!=10){
			System.out.println("��ȣ����");
		}
		keycode=System.in.read();//enter �� ġ�� 13�ϰ� 10�ϰ� �ΰ��� �߻��� �ȴ�.
		
		switch(keycode){
		case 49:
			System.out.println("������ �����ϼ̽��ϴ�");
			break;
		case 50:
			System.out.println("�б⸦ ���� �ϼ̽��ϴ�");
			break;
		case 51:
			System.out.println("���Ḧ ���� �ϼ̽��ϴ�");
			//return ;
			System.exit(0);//jvm �� ���� ��Ű�� ���̴�.
		}
		//��Ű�� �̸����� ���� Ǯ���� �̱� ������ bin���� �������� �������Ʈâ ���� ������ ��Ų��.
		//.class �����ִ� ������ ������ ��Ų��.
		
		}
		
	}

}
