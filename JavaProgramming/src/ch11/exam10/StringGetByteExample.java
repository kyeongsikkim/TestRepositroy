package ch11.exam10;

import java.io.UnsupportedEncodingException;

public class StringGetByteExample {
	public static void main(String []args){
		//영어는 다 한바이트로 인코딩을 하지만EUC-KR 의 경우는  한글은 2바이트 UTF-8은 한글을 3byte 로 한다.
		String str="안녕하세요";//2byte 로 읽어서 그렇게 나온다.
		//영어는 한바이트 한글은 2byte  MS949    EUC-KR 
		byte[]bytes1=str.getBytes();//문자열을 byte 로 만들어서 리턴한것이다. 
		System.out.println("bytes1.length:"+bytes1.length);
		String str1=new String(bytes1);
		System.out.println("bytes1->String:"+str1);//byte 를 원래 형태로  
		//인코딩 형태는 데이터를 전송할때 byte 로 바꾸는 것이다 디코딩은 byte를 원래 형태로 바꾸는 것 
		
		try{
		byte[]bytes2=str.getBytes("EUC-KR");//컴파일 에러//내가 어떤 방식으로 읽은 것인가. 존재하지 않는 문자를 집어 넣어줄 경우 문자를 변환 시킬 수없다.
		System.out.println("bytes2.length:"+bytes2.length);
		String str2=new String(bytes2,"EUC-KR");
		System.out.println(str2);
		
		
		byte[]bytes3=str.getBytes("UTF-8");//내가 값을 어떻게 읽어 들일 것이냐. UTF-8 의 형태로 바꿔준다.
		System.out.println("bytes3.lenght"+bytes3.length);
		String str3=new String(bytes3,"UTF-8");
		System.out.println(str3);
		}catch(UnsupportedEncodingException e){//지원하지 않는 인코딩을 사용할 경우 
			e.printStackTrace();//예외가 어디서 발생하는지 추적을 해서 출력해주는것 
		}
	}
	
	
	
}
