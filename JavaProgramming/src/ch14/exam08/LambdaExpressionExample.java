package ch14.exam08;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class LambdaExpressionExample {
	private static List<Student> list=Arrays.asList(new Student("ȫ�浿",90,96),new Student("���ڹ�",95,93));
	public static void main(String[] args) {
		printString((s)->{return s.getName();});
		
		printInt((s)->{return s.getEnglicshScore();});
		
		double Englishavg=avg((s)->{return s.getEnglicshScore();});
		System.out.println(Englishavg);
		double Mathavg=  avg((s)->{return s.getMathScore();});
		System.out.println(Mathavg);
	}

	public static void printString(Function<Student,String> function){
		for(Student student:list){
		System.out.println(function.apply(student)+" ");	
		}
	System.out.println();
	}
	public static void printInt(ToIntFunction<Student>function){
		for(Student student:list){
			System.out.println(function.applyAsInt(student));
		}
		System.out.println();
	}
	public static double avg(ToIntFunction<Student>function){//Function ��ü�� int ���� �����ؾ� �ȴ�. ������ü�� ���� ������ �޶�����.
		double score=0;
		for(Student student:list){
			 score+=function.applyAsInt(student);
		}
		return score/list.size();
		//����� ������ ��� ������ ����ϰ� �ʹ�.
	}
}
