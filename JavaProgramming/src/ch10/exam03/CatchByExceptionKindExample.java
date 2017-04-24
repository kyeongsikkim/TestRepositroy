package ch10.exam03;

public class CatchByExceptionKindExample {
	public static void main(String []args){
		try{
		String str=null;
		System.out.println(str.length());//nullpoint Exception 여기서 에러가 발생하게 되면은 exception은 무슨 예외인지 찾아내서 그 주소값을 값을 변수명에 값을 넣어준다.
		
		int []scores={90,85};
		for(int i=0;i<3;i++){//Array
			System.out.println(scores[i]);
		}
			String strNum="a";
			int num=Integer.parseInt(strNum);//number format Exception

	}catch(NullPointerException  |ArrayIndexOutOfBoundsException erroMessage){//e 라는 변수명은 하나만 쓰면 된다.
		//코드1 똑같은 방식으로 예외 처리 하겠다/.
		System.out.println("예외처리코드 1");
	}
		/*catch(ArrayIndexOutOfBoundsException e){
		//코드 1
   }*/
		catch(NumberFormatException e){
		//코드 2 이것만 다른 방식으로 예외 처리 하겠다.
		System.out.println("예외처리 코드 2");
	}
	}
}

