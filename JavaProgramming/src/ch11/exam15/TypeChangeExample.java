package ch11.exam15;

public class TypeChangeExample {

	public static void main(String[] args) {
		String v1="100";
		
		byte v2=Byte.parseByte(v1);
		int v3=Integer.parseInt(v1);
		double v4=Double.parseDouble(v1);
		String v5="true";
		boolean v6=Boolean.parseBoolean(v5); //해당 타입의 값으로 변경을 해준다. 변경할때 대문자로 한다.
		
		String v7=String.valueOf(v3);//레퍼 클래스는 이정도만 알면 된다.
	}

}
