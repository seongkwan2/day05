package while_;

import java.util.Scanner;

public class Ex04 {
public static void main(String[] args) {
	//은행업무인 '1)입금 2)출금 3)잔액조회 4)종료' 를 메뉴에 나타내고,
  	 //출금의 경우에서 인출 금액이 잔액보다 클 경우 안내 문구를 내보낸다.
  	//이때 입금, 출금, 잔액조회에서는 사용자에게 비밀번호(1234)를 요구하게 된다.


Scanner input = new Scanner(System.in);
		
		int num;
		int pass = 1234;
		int passCheck;
		int money = 0;
		int addMoney;
		int deleteMoney;
		
		while(true) {
			System.out.println("1)입금\n2)출금\n3)잔액조회\n4)종료");
			num = input.nextInt();
			if(num == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(num <= 3 && num >=1) {
				System.out.print("비밀번호를 입력해주세요 : ");
				passCheck = input.nextInt();
				if(pass == passCheck) {
					switch(num) {
					case 1 : System.out.print("입금할 금액을 입력하세요 : ");
				 		addMoney = input.nextInt();
				 		money += addMoney;
				 		System.out.println("입금되었습니다.");
				 		break;
					case 2 : System.out.print("출금할 금액을 입력하세요 : ");
							 deleteMoney = input.nextInt();
							 if(money < deleteMoney) {
								 System.out.println("잔액이 부족합니다.");
							 }else {
								 money -= deleteMoney;
								 System.out.println(deleteMoney + "원이 출금 되었습니다.");
								 System.out.println("출금 후 잔액 : " + money + "원");
							 }
							 break;
					case 3 : System.out.println("잔액은 " + money + "원 입니다.");
							 break;
					}	
				}else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
				
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
}
}
