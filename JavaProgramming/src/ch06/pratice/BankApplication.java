package ch06.pratice;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];// �ΰ��� �ʵ� �̴�. ���¸�
																// ���� �� �մ� �迭 ����
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			/*Account aa=null;
			aa.getAno(); �̷� ��� nullexception*/
			System.out.println("-----------------------------");
			System.out.println("1.���»���|2.���¸��|3.����|4.���|5.����");
			System.out.println("------------------------------");
			System.out.println("����>");
			int selectNo = Integer.parseInt(scanner.nextLine());
			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}

	private static void createAccount() {
		System.out.print("���¹�ȣ:");
		String ano = scanner.nextLine();

		System.out.print("������:");
		String owner = scanner.nextLine();

		System.out.print("�ʱ� �Աݾ�:");
		int balance = Integer.parseInt(scanner.nextLine());
		Account account = new Account(ano, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = account;
				break;
			}
		}
		System.out.println("���°� �����Ǿ����ϴ�");
	}

	private static void accountList() {
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				break;
			}
			System.out.println(accountArray[i].getAno() + "|| " + accountArray[i].getOwner() + "||"
					+ accountArray[i].getBalance());
		}
	}

	private static void deposit() {
		System.out.println("���¹�ȣ:");
		Account find = findAccount(scanner.nextLine());
		//System.out.println(find);
		if (find == null) {// ���������� null �� �ؼ� ������ �� �� �ִ�.
			System.out.println("���¹�ȣ�� �����ϴ�");
		} else {

			System.out.print("���ݾ�:");
			int balance = Integer.parseInt(scanner.nextLine());
			find.setBalance(find.getBalance() + balance);
			System.out.println("������ �����ϼ̽��ϴ�");
		}
	}

	private static void withdraw() {
		System.out.println("���¹�ȣ:");
		Account find = findAccount(scanner.nextLine());
		if (find == null) {
			System.out.println("���¹�ȣ�� �����ϴ�");
		} else {
			System.out.print("��ݾ�:");
			int balance = Integer.parseInt(scanner.nextLine());
			find.setBalance(find.getBalance() - balance);
			System.out.println("����� �����ϼ̽��ϴ�");
		}
	}

	private static Account findAccount(String ano) {
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i]==null){
				return null;
			}
			else if (ano.equals(accountArray[i].getAno())) {
				return accountArray[i];//return �ڿ��� ��� �ڵ嵵 �� �� ����.
			}
		}
			return null;
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/*private static Account findAccount(String ano) {
		for (int i = 0; i < accountArray.length; i++) {
			if (ano.equals(accountArray[i].getAno())) {
		//nullException �� ���⼭ �߻��Ѵ�. ������ accountArray �迭 �ȿ��� null �� �ʱ�ȭ �Ǿ��ְ� ��ü�������� ���ؼ� ���� ��� �� �� ���°Ͱ���.
				return accountArray[i];//return �ڿ��� ��� �ڵ嵵 �� �� ����.
			}
			System.out.println("yyyyyy");
		}
				return null;
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
	}*/
}
	