package for_;

public class Ex03 {

	public static void main(String[] args) {
		/*
		int n1, n2;
		for(n1=1; n1<5; n1++) {
			for(n2=1; n2<5; n2++) {
				System.out.println("n1 : "+n1+", n2 : "+n2);
			}
		}
		/*
		 2 * 1 = 2
		 2 * 2 = 4
		 ...
		 9 * 9 = 81
		 */
		int i,j;
		for(i=2; i<=9; i++) {
			System.out.println(i+"단");
			for(j=1; j<=9; j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}
			System.out.println();
		}
		
		int q,w;
		System.out.println("구구단");
		for(q=1; q<=9; q++) {
			for(w=2; w<=9; w++) {
				System.out.print(w+"x"+q+"="+q*w+"\t");
			}
			System.out.println();
		}
	}
}










