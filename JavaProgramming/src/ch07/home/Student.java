package ch07.home;

public class Student extends People{
	public int studentNo;
	
	Student(String name,String ssn,int studentNo){
		super(name,ssn);
		this.studentNo=studentNo;
	}

}
