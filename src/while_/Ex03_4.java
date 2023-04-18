package while_;

import java.util.Scanner;
/*
public class Ex03_4 {

	public static void main(String[] args) {
1. 		*
	     **
	    ***
	   ****
	  *****         ←요렇게 만들어주세요!😊

2. 점수를 입력받아 80점 이상이면 합격메시지를 그렇지 않으면 불합격 메시지를 출력하는 작업을 반복하다가
  0~100점 이외의 점수가 입력되면 종료하는 프로그램을 만들어주세요!❤️ 
  (🚨단, 정수가 아니면 오류 처리 뜨고 다시 반복하게 만들어주세용)

3. 정수를 입력 받고 구구단(2단~9단)에 있는지 확인하는 프로그램을 만들어주세요!🥳






























































✨1번 정답✨
for(int i=1; i<=5; i++) {
	for(int j=1; j<=5-i; j++) {
		System.out.print(" ");
	}
		for(int k=1; k<=i; k++) {
			System.out.print("*");
		}
		System.out.println();
}


✨2번 정답✨
while(true)
  {
     Scanner scn = new Scanner(System.in);
     System.out.print("점수를 입력하세요. : ");
     int scr = scn.nextInt();

     if( scr < 0 || scr > 100)
     {
        System.out.println("이 점수는 그냥 나가주세요><");
        continue;
     }
     else if( scr>=80)
     {
        System.out.println("축하합니다. 합격입니다.");
        break;
     }
     else
     {
        System.out.println("죄송합니다 불합격이세요 재시험 부탁드립니다ㅜㅜㅜ");
     }
  }


✨3번 정답✨
     Scanner scan = new Scanner(System.in);
     int num1, num2=0;
     System.out.println("수를 입력하시오");
     num1 = scan.nextInt();
     for(int i=1;i<=9;i++) {
        for(int j=1;j<=9;j++) {
           num2 = i*j;
           if(num1==num2) {
              System.out.println("구구단에 있습니다");
              num2 = 0;
              break;
           }
        }
        if(num2 == 0) {
           break;
        }
     }
     if(num2 != 0) {
        System.out.println("구구단에 없습니다");
     }
		
	}
}
*/






















