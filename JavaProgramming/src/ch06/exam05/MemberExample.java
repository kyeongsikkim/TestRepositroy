package ch06.exam05;

import java.util.Scanner;
public class MemberExample {
//����� ����Ʈ â���� �����Ű�°�??? 
	public static void main(String[] args) {
	/*	//while(true){//����Ÿ������ scanner ���� ���� �Ѱ�
			Scanner scanner=new Scanner(System.in);//��� ��Ű���� �ִ� Ŭ�������� ��ø� ����� �ϱ� ������ import �� �ؾ� �Ѵ�.
			//�ڹ� utill ��Ű�� �ȿ� �ְ� JAVA ǥ�� API �̻����ڴ� Ŭ���� �ȿ� ����.
			//���Ӹ����� API �� ���� ������ �޼ҵ带 Ȯ�� �� �� �ִ�.
			//system.in �� Ű����� ���� �о���δ�.�����ڴ� ��ü�� ���鶧�� ����� �Ѵ�.
		//scanner.nextLine();//����ġ�� ������ ��� ���ڿ��� �о�鿩��
		int num=scanner.nextInt();//12/r/n ���͸� ġ�� �̷��� �ȴ�.����ġ�� ������ �д´�.nextInt();12���� �д´�.
		System.out.println(num);
		int num2=scanner.nextInt();
		System.out.println(num2);
		String str=scanner.nextLine();
		System.out.println(str);
		//������ �� ���ڿ��� �޾Ƶ��̰� parseint �� �ٲ㼭 ����� �Ѵ�.
*/	
		Scanner scanner=new Scanner(System.in);
		Member[] members=new Member[100];//�ܼ��� �迭�� ����� null ���������� null�̴�. �� �迭�̱⶧���� ����Ű�� �ּҰ� ����.
		while(true){
			System.out.println("-----------------------");
			System.out.println("1.ȸ������|5.����");
			//Scanner scanner=new Scanner(System.in);//�̷��� ������ �ϸ�heap������ ����ؼ� ����� �ȴ�.
		System.out.print("����:");//�ٹٲ��� �Ǵ� ���̴�.
		String strNum=scanner.nextLine();
		//������ ������ ������ ���ڿ� ������ ��� �� �� �ִ�.
		if(strNum.equals("1")){
			String name=scanner.nextLine();
			int age=Integer.parseInt(scanner.nextLine());
			Member member=new Member(name,age);
			for(int i=0;i<members.length;i++){
				if(members[i]==null){//����Ű�� �ּҰ� �ֳ� ���� Ȯ���ϴ°� 
					members[i]=member;
					break;
				}
			}
			//members[i]=new Member(name,age);
		}else if(strNum.equals("5")){
			
		}
		//���� ȿ���� null �� �̿��Ѵ�. �׷��� ���ο� ��ü�� ���� ������ ������ �� �ִ�.
		}
		}

}
