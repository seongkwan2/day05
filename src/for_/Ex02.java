package for_;

public class Ex02 {

	public static void main(String[] args) {
		
		int su1, su2, sum = 0;
		for(su1 = 1; su1<=3; su1++) {
			System.out.println("상위 for 시작");
			for(su2=1; su2<=3; su2++) {
				sum +=1;
				System.out.println("하위 for 동작");
			}
			System.out.println("상위 for 종료");
		}
		System.out.println("sum : "+sum);
		
	}
}
