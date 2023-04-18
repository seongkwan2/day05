package while_;

import java.util.Scanner;

public class Ex03_3 {

	public static void main(String[] args) {
		/*
		//1번문제
		//문제 : 사용자로부터 행과 열의 값을 입력받아 아래와 같이 출력하는 프로그램을 작성하시오
		//*행 (1부터 10까지의 수), 열(1부터 50까지의 수)
		//*0을 입력하면 "잘못된 입력입니다." 출력

		Scanner input = new Scanner(System.in);

		int i, j; 

		System.out.println("행의 값을 입력하시오");
		int a=input.nextInt();
		System.out.println("열의 값을 입력하시오");
		int b=input.nextInt();

		if(a<=10 && b<=50 && a!=0 &&b!=0) {
			for(i=1; i<=a; i++) {
				for (j=1; j<=b; j++ ) {

					System.out.print(i*j+" ");
				}
				System.out.println();
			} 

		}else {
			System.out.println("잘못된 입력입니다.");
		}
	}
}
		 */

		//2번문제
		//은행업무인 '1)입금 2)출금 3)잔액조회 4)종료' 를 메뉴에 나타내고,
		//출금의 경우에서 인출 금액이 잔액보다 클 경우 안내 문구를 내보낸다.
		//이때 입금, 출금, 잔액조회에서는 사용자에게 비밀번호(1234)를 요구하게 된다.


		Scanner scan = new Scanner(System.in);
		int m_in=0,
				m_out=0,
				money=0,
				pw=0,
				menu=0,
				pw_cnt;



		while(true) {

			System.out.println("1.입금\n2.출금\n3.잔액조회\n4.종료\n");
			System.out.println("번호를 입력해주세요: ");
			menu = scan.nextInt();
			if(menu == 1) {
				System.out.println("입금을 선택하셨습니다.");
				while(true) {
					System.out.println("비밀번호 4자리를 입력해주세요");
					System.out.println("비밀번호: ");
					pw = scan.nextInt();
					if(pw == 1234) {
						System.out.println("비밀번호가 일치합니다.");
						System.out.println("얼마를 입금하시겠습니까?: ");
						m_in = scan.nextInt();

						money = money + m_in;
						System.out.println(m_in+"원 이 입금되었습니다.");
						System.out.println("현재 잔액: "+money+"원\n");
					}
					else {
						System.out.println("비밀번호가 일치하지 않습니다.\n");
						continue;
					}break;
				}
			}// if 1
			else if(menu == 2) {
				System.out.println("출금을 선택하셨습니다.");
				while(true) {
					System.out.println("비밀번호 4자리를 입력해주세요");
					System.out.print("비밀번호: ");
					pw = scan.nextInt();
					if(pw == 1234) {
						System.out.println("비밀번호가 일치합니다.");
						System.out.println("현재 잔액: "+money+"원\n");
						if(money==0) {
							System.out.println("잔액이 없어서 출금이 불가능합니다.");
							System.out.println("초기화면으로 돌아갑니다.\n");
							break;
						}
						System.out.println("얼마를 출금하시겠습니까?: ");
						m_out = scan.nextInt();
						if(money>m_out) {
							money = money-m_out;
							System.out.println(m_out+"원 이 출금되었습니다.");
							System.out.println("현재 잔액: "+money+"원\n");
						}else {
							System.out.println("잔액이 부족합니다.");
							System.out.println("현재 잔액: "+money+"원\n");
						}
					}else {
						System.out.println("비밀번호가 일치하지 않습니다.\n");
						continue;
					}break;
				}
			}//if 2
			else if(menu == 3) {
				System.out.println("잔액조회를 선택하셨습니다.");
				while(true) {
					System.out.println("비밀번호 4자리를 입력해주세요");
					System.out.println("비밀번호: ");
					pw = scan.nextInt();
					if(pw == 1234) {
						System.out.println("현재 잔액: "+money+"원\n");
						break;
					}else {
						System.out.println("비밀번호가 일치하지 않습니다.\n");
					}
				}
			}//if 3
			else if(menu == 4) {
				System.out.println("시스템을 종료합니다.");
			break;
			}//if 4
			else {
				System.out.println("1,2,3,4 중에 입력해주세요.\n");
			}
		}
	}
}










//3번문제
//반복문 연습문제
//1.아메리카노 2.라떼 두가지 메뉴가 있는 자판기가 있다. 메뉴를 선택하고
//돈을 지불하고 거스름돈을 받도록 프로그래밍 하시오
//조건: 지불할돈이 부족할경우 처음으로 가지않고 다시 돈을 지불하는 기능이 있어야함
//아메리카노 1,000원 / 라떼 1,500원

/*
		while(true) {

			int am = 1000, la = 1500, 
					mymoney=0, sum=0, menu=0, 
					am_su=1 ,la_su=1;

			Scanner scan = new Scanner(System.in);
			System.out.println("===========메뉴를 선택해주세요===========");
			System.out.println("1.아메리카노(1000원)  2.라떼(1500원)");
			System.out.println("=====================================");
			System.out.println("메뉴 입력: ");
			menu = scan.nextInt();

			if(menu == 1) {
				System.out.println("선택하신 메뉴는 아메리카노 입니다.");
				System.out.println("아메리카노 몇 잔 드릴까요?\n");
				System.out.println("개수 입력: ");
				am_su = scan.nextInt();
				int am_money = am*am_su;
				System.out.println("아메리카노 "+am_su+"잔 주문하셨습니다.");
				System.out.println("가격은 "+am_money+"원 입니다.");

				while(true) {
					System.out.println("돈을 지불해주세요\n");
					System.out.println("지불할 돈 입력: ");
					mymoney = scan.nextInt();
					if(am_money>mymoney) {
						System.out.println("잔액이 부족합니다.");
						continue;
					}else{
						System.out.println("잔액은 "+(mymoney-am_money)+"원 입니다.");
						System.out.println("아메리카노 "+am_su+"잔 주문되었습니다.\n");
						break;
					}
				}
			}

			if(menu == 2) {
				System.out.println("선택하신 메뉴는 라떼 입니다.");
				System.out.println("라떼 몇 잔 드릴까요?\n");
				System.out.println("개수 입력: ");
				la_su = scan.nextInt();
				int la_money = la*la_su;
				System.out.println("라떼 "+la_su+"잔 주문하셨습니다.");
				System.out.println("가격은 "+la_money+"원 입니다.");

				while(true) {
					System.out.println("돈을 지불해주세요\n");
					System.out.println("지불할 돈 입력: ");
					mymoney = scan.nextInt();
					if(la_money>mymoney) {
						System.out.println("잔액이 부족합니다.");
						continue;
					}else{
						System.out.println("잔액은 "+(mymoney-la_money)+"원 입니다.");
						System.out.println("라떼 "+la_su+"잔 주문되었습니다.\n");
						break;
					}
				}
			}
		}
		




 */
