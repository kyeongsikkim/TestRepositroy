package ch11.exam05;
//java .lang 은 import 없이 사용이 가능하다.
public class SystemExample {

	public static void main(String []args){
		System.setSecurityManager(new SecurityManager(){
			@Override
			public void checkExit(int status) {//예외를 발생시킨다.
				//System.out.println("checkExit");
				if(status!=54321){
					throw new SecurityException();//예외를 발생시키는 코드  실행예외 이기 때문에 try catch 안붙여도 된다. 컴파일 에러가 아니다.
				}
			}
		});//키보드를 대보면securityManger 객체를 집어 넣으라는 것이다
		
		
		for(int i=0;i<10;i++){//열번을 반복해야 된다.i 가 5되는 순간에 밑에 코드가 실행되어 jvm 종료가 발생한다.
			System.out.println(i);
			if(i==5){
				//내가 정의한 값을 줘야지 종료할 수 있게 만들 필요도 있다.
				try{
				System.exit(0);//그래서 번호를 받는다 내가 원하는 숫자를 입력했을 때 종료 될 수 있게 부를 경우 checkExit 가 실행이 된다.
				}catch(SecurityException e){}
				//아무것도 안넣는 것은 무시를 하겠다. 그냥 그리고서 다시실행하겠다.
				}
		}
	}
}
