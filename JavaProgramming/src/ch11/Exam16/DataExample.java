package ch11.Exam16;

import java.util.Calendar;
import java.util.Date;

public class DataExample{

	public static void main(String[] args) {
		Date now=new Date();
		System.out.println(now);
		//�����ڸ� ���Ƴ���.
		Calendar cal=Calendar.getInstance();//��ǻ�� �ð�����
		int year=cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH)+1;//0���� 11������ 1�� ��������Ѵ�.
		int data=cal.get(Calendar.DAY_OF_MONTH);
		int hour=cal.get(Calendar.HOUR);
		int minute=cal.get(Calendar.MINUTE);
		int second=cal.get(Calendar.SECOND);
		
		System.out.println(year+"-"+month+"-"+data);
	}

}
