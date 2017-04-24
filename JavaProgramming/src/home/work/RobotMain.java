package home.work;

import java.util.Scanner;

public class RobotMain {
	public static void main(String[] args) {
		Robot robot=new Robot("로봇","빨강");
		System.out.println("로봇 상세정보:"+robot.name+robot.color);
		
		Scanner scanner=new Scanner(System.in);
		Scanner scanner1=new Scanner(System.in);
		while(true){
			System.out.print("1.power on|2.power off "+":");
		int i=scanner.nextInt();
		if(i==1){
		robot.powerOn();
		robot.armMove();
	/*	System.out.println("부품 교체 하시겠습니까(yes/no)?");
		String a=scanner1.nextLine();
		if(a.equals("yes")||a.equals("YES")){
			
		}else if(a.equals("no")||a.equals("NO"){
				
			}else{
				
		}*/
		}else{
			robot.powerOff();
			break;
		}
		}
	}

}
