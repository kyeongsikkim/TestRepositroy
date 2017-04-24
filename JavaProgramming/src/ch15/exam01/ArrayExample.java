package ch15.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayExample {
	public static void main(String []args){
		Student [] array=new Student[3];
		array[0]=new Student("s1");
		array[1]=new Student("s2");
		array[2]=new Student("s3");
		array[3]=new Student("s4");
		array[2]=null;//가비지 객체 
		List<Student>list=new ArrayList</*Student생략가능하다*/>();//list 는 인터페이스이다. 구현 객체 가 필요하다 인터페이스로 이용가능한 실제 객체가 필요하다.
		for(int i=0;i<100;i++){
			list.add(new Student("s1"));
		}
		list.remove(1);
		
	}
}
//객체 비교할때는
