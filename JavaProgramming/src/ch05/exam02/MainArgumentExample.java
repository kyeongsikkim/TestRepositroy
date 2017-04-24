package ch05.exam02;

public class MainArgumentExample {

	public static void main(String[] args) {//배열 번지가 들어온다.
		if(args.length==2){
			String v1=args[0];
			int intv1=Integer.parseInt(v1);//integer.parseInt 는 문자를 숫자로 바꿔주는것 
			String v2=args[1];
			int intv2=Integer.parseInt(v2);
			System.out.println(intv1+intv2);
		}else{
			System.out.println("두개의 실행 매개 값이 필요합니다.");
		}
		
		//ch05.exam02.MainArgumentExample//패키지가 있다면 풀네이임이 클래스 전체가 되는 것이다.즉 패키지 처음 부터 시작을 해야 클래스가 되는 것이다. 
		//.class 있는 곳에서 실행을 시켜야 하므로 bin 까지 간다.명령프롬트에서 실행할때는 패키지 이름 까지 포함해서 실행을 시켜야 클래스가 된다.
	}

}
