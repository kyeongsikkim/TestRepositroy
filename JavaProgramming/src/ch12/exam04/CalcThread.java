package ch12.exam04;

public class CalcThread extends Thread{
public CalcThread(String name){
	setName(name);
}
public void run(){
	for(int i=0;i<20000000;i++){//�ѹ��� �ο����� �������� ���� �� �־
		
	}
	System.out.println(getName());
}
}
