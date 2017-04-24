package ch11.exam14;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		char[]arr1={'J','A','V','A'};
		char[]arr2=Arrays.copyOf(arr1, arr1.length);//배열을 복사해주는 것이다.
		
		System.out.println(Arrays.toString(arr2));//알아서 출력이 되주는 것이다.
		
		char[]arr3=Arrays.copyOfRange(arr1,1,3);
		System.out.println(Arrays.toString(arr3));//.toString 은 재정의로 볼수없는것이 object 는 매개변수가 없고 이 메소드를 사용하기 위해서는 arrays 의 객체를 생성해서
		//사용을 해야 되는데 arrays는 객체가 생성된 부분이 없다.object toString 은 매개변수가 없다.
		
		char[]arr4=new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0,arr1.length);
		for(int i=0;i<arr4.length;i++){
			System.out.println("arr4["+i+"]="+arr4[i]);
		}
		
	}

}
