package problem.BOJ;

import java.util.Scanner;

public class Q2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int m=B+C;
		
		if(m>=60) {
			if(A==23) {
				System.out.println(0+" "+(m-m/60*60));
			}else {
				System.out.println((A+(m/60))+" "+(m-m/60*60));
			}
		}else {
			System.out.println(A+" "+m);
		}
		sc.close();
	}
}
