package ch11.exam14;

import java.util.Arrays;

public class ArraysExample {

	public static void main(String[] args) {
		int[]nums={1,2,3,4,5};
		System.out.println(Arrays.binarySearch(nums, 6));//�ִ� ���� ã�Ƴ��� index ���� ����Ѵ�. ���� 3�� �ִ� �ε����� 2�̴�.
		String[]names={"ȫ�浿","���ڹ�","�繰���ͳ�","���ڹ�2","�ȳ�p"};
		System.out.println(Arrays.binarySearch(names, "���ڹ�5"));//���ڹ� ������ ���ڹ� �ִ� �ε����� ������ش�. ���� ���ڹ�2�� ã���� 
	}

}
