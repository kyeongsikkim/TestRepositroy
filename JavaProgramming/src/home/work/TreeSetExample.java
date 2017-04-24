package home.work;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		//Set<Integer>set=new TreeSet<Integer>();//부모에게 선언된것만 사용가능하다. set interface 재정의 한것이다. 다형성 재정의 된것을 사용할 수 있다.comparable
		TreeSet<Integer>set=new TreeSet<Integer>();
		set.add(87);
		set.add(98);
		set.add(75);
		set.add(95);
		set.add(80);
	
		int min=set.first();
		System.err.println(min);
		int max=set.last();
		System.out.println(max);
		
		Set<Integer>set2=set.subSet(80, true, 90, false);
		for(int score:set2){
			System.out.println(score);
		}
		System.out.println("-------------------------------------------------------");
		Set<Integer>set3=set.descendingSet().descendingSet();
		for(int score:set3){
			System.out.println(score);
		}
	}

}
