package ch11.exam14;

import java.util.Arrays;

public class ArraysExample {

	public static void main(String[] args) {
		int[]nums={1,2,3,4,5};
		System.out.println(Arrays.binarySearch(nums, 6));//있는 값을 찾아낸다 index 값을 출력한다. 숫자 3이 있는 인덱스는 2이다.
		String[]names={"홍길동","감자바","사물인터넷","감자바2","안녕p"};
		System.out.println(Arrays.binarySearch(names, "감자바5"));//감자바 넣으면 감자바 있는 인덱스를 출력해준다. 없는 감자바2를 찾으면 
	}

}
