package ch15.exam08;

import java.util.Comparator;

public class CompareByName implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		
		return o1.getName().compareTo(o2.getName());//기존것이 더크면 1 같으면 0 작으면 -1;
		}

}
