package ch06.exam07;

public class Calculator {
	static String model="MI-84";
	static String makeDay="2017.03.29";
	static String info;//model makeday
	//static �� ������ ����� static ��Ͽ��� �ض�
	static{//�޼ҵ� ������ �ڵ尡 �ö󰡸� ������ �ȴ�.static �ʵ��� ������ ����� ���ش�.
		info=model;
		info+="(";
		info+=makeDay;
		info+=")";
	}
	
}
