package ch11.Exam16;

import java.util.Calendar;
import java.util.Date;

public class DataExample{

	public static void main(String[] args) {
		Date now=new Date();
		System.out.println(now);
		//생성자를 막아놨다.
		Calendar cal=Calendar.getInstance();//컴퓨터 시간으로
		int year=cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH)+1;//0부터 11까지라서 1을 더해줘야한다.
		int data=cal.get(Calendar.DAY_OF_MONTH);
		int hour=cal.get(Calendar.HOUR);
		int minute=cal.get(Calendar.MINUTE);
		int second=cal.get(Calendar.SECOND);
		
		System.out.println(year+"-"+month+"-"+data);
	}

}
