package ch15.exam02;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListExample {

	public static void main(String[] args) {
		List<String>list=Arrays.asList("ȫ�浿","�ſ��","���ڹ�");//�� ������ ��� �ȴ�.�׽�Ʈ �ؾ� �ȴ�.�迭�ϰ� �Ȱ���.
		for(String str:list){
			
			System.out.println(str);
		}
		//list.add("NEW");�������� �ʴ´�. �߰��� ���� �ʴ´� Arrays.asList �� ���� �κ��� ������ ���� �ʴ´�. �迭�� ������ ���ϴ�.
		List<Integer>list2=Arrays.asList(1,2,3);//List �� �⺻ Ÿ���� �ȵ��� ��ü Ÿ�Ը� �����ִ�.
		for(int Int:list2){
			System.out.println(Int);
		}
		
	}

}
//���ʹ� ����ȭ�� �Ǿ��ִ�. arrayList �� ������ü�� �ȴ�.
//list new vector 
//