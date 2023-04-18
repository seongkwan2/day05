package for_;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 F11 : 디버깅 시작
		 F5 : 한줄씩 실행 (메서드 안으로 들어감)
		 F6 : 한줄씩 실행
		 F8 : run. 다음 break point 지점으로 이동
		 ctrl + F2 : 디버깅 종료
		 */
		System.out.println("main 시작");
		int sum = 0;
		for(int i=1; i<10000; i++) {
			sum += i;
			System.out.println(i+"종속문장");
		}
		System.out.println("sum : " +sum);
		System.out.println("main 종료");
		
		for(int i=1; i<10000; i++) {
			sum += i;
			System.out.println(i+"종속문장");
		}
		System.out.println("sum : " +sum);
		System.out.println("main 종료");
	}

}
