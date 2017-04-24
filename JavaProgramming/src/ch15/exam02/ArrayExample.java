package ch15.exam02;

import java.util.ArrayList;
import java.util.List;

public class ArrayExample {

	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		List<Integer>list2=new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			list2.add(i);
		}
		for(int i:list2){
			System.out.println(i);
		}
		list.add("0.Java");
		list.add("1.JDBC");
		list.add("2.Database");
		list.add("3.Servlet/JSP");
		list.add("4.iBATIS");
		
		System.out.println("ÃÑ °´Ã¼¼ö"+list.size());
		
		System.out.println("Æ¯Á¤ ÀÎµ¦½º"+list.get(2));
		
		for(int i=0;i<list.size();i++){
			String str=list.get(i);
			System.out.println(i+":"+str);
		}
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");
		
		for(int i=0;i<list.size();i++){
			String str=list.get(i);
			System.out.println(i+":"+str);
		}
		
	}

}
