package ch05.exam02;

public class ArrayExample04 {
	public static void main(String[] args) {// 비어있는 객체가 들어온다.
		int [][] scores={{85,90},{77,88,44},{11,22,33,44,55,66}};
		System.out.println(scores.length);
		System.out.println(scores[2].length);
		System.out.println();
		String[]v1={"Java","C#","C++"};
		for(int i=0;i<v1.length;i++){
			System.out.println(v1[i]);
		}
		for(String lang:v1){
			System.out.println(lang);
		}
		
	}
}