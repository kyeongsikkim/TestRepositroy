package ch15.exam08;

import java.util.Comparator;

public class CompareByage implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		
		return Integer.compare(o1.getAge(), o2.getAge());
		}

}
//비교기능이 있는 객체 만들기

