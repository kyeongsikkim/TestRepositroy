package ch06.pratice;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];// 두개의 필드 이다. 계좌를
																// 담을 수 잇는 배열 생성
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			/*Account aa=null;
			aa.getAno(); 이런 경우 nullexception*/
			System.out.println("-----------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("------------------------------");
			System.out.println("선택>");
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
		System.out.println("프로그램 종료");
	}

	private static void createAccount() {
		System.out.print("계좌번호:");
		String ano = scanner.nextLine();

		System.out.print("계좌주:");
		String owner = scanner.nextLine();

		System.out.print("초기 입금액:");
		int balance = Integer.parseInt(scanner.nextLine());
		Account account = new Account(ano, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = account;
				break;
			}
		}
		System.out.println("계좌가 생성되었습니다");
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
		System.out.println("계좌번호:");
		Account find = findAccount(scanner.nextLine());
		//System.out.println(find);
		if (find == null) {// 참조변수는 null 로 해서 생성을 할 수 있다.
			System.out.println("계좌번호가 없습니다");
		} else {

			System.out.print("예금액:");
			int balance = Integer.parseInt(scanner.nextLine());
			find.setBalance(find.getBalance() + balance);
			System.out.println("예금이 성공하셨습니다");
		}
	}

	private static void withdraw() {
		System.out.println("계좌번호:");
		Account find = findAccount(scanner.nextLine());
		if (find == null) {
			System.out.println("계좌번호가 없습니다");
		} else {
			System.out.print("출금액:");
			int balance = Integer.parseInt(scanner.nextLine());
			find.setBalance(find.getBalance() - balance);
			System.out.println("출금이 성공하셨습니다");
		}
	}

	private static Account findAccount(String ano) {
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i]==null){
				return null;
			}
			else if (ano.equals(accountArray[i].getAno())) {
				return accountArray[i];//return 뒤에는 어떠한 코드도 올 수 없다.
			}
		}
			return null;
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/*private static Account findAccount(String ano) {
		for (int i = 0; i < accountArray.length; i++) {
			if (ano.equals(accountArray[i].getAno())) {
		//nullException 이 여기서 발생한다. 이유는 accountArray 배열 안에는 null 로 초기화 되어있고 객체를생성을 안해서 값을 얻어 올 수 없는것같다.
				return accountArray[i];//return 뒤에는 어떠한 코드도 올 수 없다.
			}
			System.out.println("yyyyyy");
		}
				return null;
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
	}*/
}
	