package ch11.exam14;


import java.util.Arrays;
import java.util.Collections;
//��ü ���� ���� ���� �� toString �� ������ �ؾ� �ȴ�. ���������� Ÿ�� ��ȯ�� �ؾ� �ȴ�.
public class SortExample {

	public static void main(String[] args) {
	/*	String xx="yy";
		System.out.println(xx);
		System.out.println(xx.toString());*/
		String[]names={"ȫ�浿","��μ�","�ڵ���"};//��Ʈ���� comparable �� �����ߴ� interfac �� ������ �ؼ� ����� �� �� �ִ�.
		
		System.out.println(Arrays.toString(names/*.toString �� �پ ����� �Ǵ°��ε� String ������ �̹� toString �� ���� ���Ǹ� �س��� ���̴�.*/));//�迭�� �ִ� ���� ����ϰ� �ȴ�.
		//�ø��������� ���� 
		Arrays.sort(names);
		
		System.out.println(Arrays.toString(names));
		//��������
		Arrays.sort(names,Collections.reverseOrder());
		
		Member[] members={new Member("ȫ�浿",20),new Member("��μ�",15),new Member("�ڵ���",18)};
		
		System.out.println(Arrays.toString(members));//��ü�� toString �� �ְ� �Ǹ���  ��Ű�� �̸� �� ������ Ŭ������ ���´�. Ÿ�Ժ�ȯ�� �ɷ��� ����� �޴��� �������̽���� ����� ������ �ؾ� �ȴ�.
		
		Arrays.sort(members);
		System.out.println(Arrays.toString(members/*.toString()*������Ʈ�� toString �� �پ� �ִ� ���̴�.*/));
		
		Arrays.sort(members,Collections.reverseOrder());
		System.out.println(Arrays.toString(members));
	}

}
//sort ��� �ȿ��� Comparable com=new Member("ȫ�浿"); �̰� �ȵȴٴ� ���̴�.
//comparable �� �Ӹ� �������� ������ ���� ���ϴ� ���̴�.