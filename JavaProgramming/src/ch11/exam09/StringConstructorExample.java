package ch11.exam09;

public class StringConstructorExample  {
	public static void main(String []args)throws Exception{
		String s1="abc";
		String s2=new String("abc");
		
		char []charArray={'a','b','c'};//char 배열을 매개값으로 갖는게 있으면 집어 넣으면 된다.
		String s3=new String(charArray);
		
		byte[]byteArray={49,50,51};//byte 를 넣는게 있으면 넣어주면 된다.
		String s4=new String(byteArray);//키코드 값이 나온다 문자로 변환되어서 스트링으로 출력이 된다.49 가 1,50=2,51=3 인것이다. 형태변환할때는 생성자

		System.out.println(s3);
		byte[] inputData=new byte[100];//byte 배열을 받는게 잇는데 모든 것을 문자열로 갖고 싶지는 않고 일부분만 문자열로 만들구 싶을 때 사용한다.
		int readByteNo=System.in.read(inputData);//컴파일 예외 처리 해줘야 한다. byte 배열을 넣으면 전체를 읽어낸다.여기서 hello 일경우 엔터포함해서 8이 반환이 되어진다.
		//8이리턴한다 hello 엔터 키보드로 hello 를 치고 엔터를 칠 경우 100개의 byte 들어갈수있는 배열을 선언했다. 배열마다 키코드가 들어간다
		//총 8개가 들어가게 된다. hello 만 빼내기 위해서는  바이트 배열을 첫번째 매개변수로 준다 전체를 준다 0부터 총 문자가 들어가 있는 곳까지 한다.
		//문자가 고정적이지 않기 때문에  system.in.read 는 실제로 읽은 바이트 수를 리턴한다. 이전까지만 만든다라는뜻 이것은 내가 입력해준  데이터 값을 
		//읽어서 읽은 바이트 수를 리턴해준다. 먼저 생성자를 찾는다 그다음에메소드를 찾는다.
		 String strData=new String(inputData,0,readByteNo-2);//0부터 시작은 해서 (int length) 마지막은 length
	
		 byte[]byteArray2={49,50,51,52,53,54};
		String strData2=new String(byteArray2,3,3);
		System.out.println(strData2);
	}
}
