package ch07.exam06.pack1;

public class C {
	
	public void test(){
		A a=new A();
		a.field=10;//객체를 생성해도 접근 불가
		a.method();
	}
}
