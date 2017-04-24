package ch11.exam11;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String text="홍길동/이수홍/박연수";
		StringTokenizer st=new StringTokenizer(text,"/|&|,");
		int countTokens=st.countTokens();
		for(int i=0;i<countTokens;i++){
			String token=st.nextToken();
			System.out.println(token);
		}
		System.out.println();
	st=new StringTokenizer(text,"/");
	while(st.hasMoreTokens()){
		String token=st.nextToken();//한번 값을 뽑아 왔으면 다시 돌아가서  만들어야 된다.
		System.out.println(token);
	}
}

}
