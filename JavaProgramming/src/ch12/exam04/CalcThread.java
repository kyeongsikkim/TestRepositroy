package ch12.exam04;

public class CalcThread extends Thread{
public CalcThread(String name){
	setName(name);
}
public void run(){
	for(int i=0;i<20000000;i++){//한번에 부여받은 권한으로 끝낼 수 있어서
		
	}
	System.out.println(getName());
}
}
