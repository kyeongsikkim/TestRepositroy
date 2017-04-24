package ch11.exam06;

public class GcExample {

	public static void main(String[] args) {
	/*	Member m1=new Member("blue");//가비지
		m1=null;
		m1=new Member("white");//가비지
		m1=new Member("red");*/
		for(int i=0;i<10000;i++){
			Member m1=new Member(String.valueOf(i));//빈문자에 숫자를 더하면 문자 취급된다.""+i;
			System.gc();//JVM 이 지우고 싶은것 부터 지우게 한다. 잘 사용 안한다.
		}
		

	}

}
