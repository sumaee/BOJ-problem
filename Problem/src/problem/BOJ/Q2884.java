package problem.BOJ;

import java.util.Scanner;

public class Q2884 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int H=sc.nextInt();
		int M=sc.nextInt();
		
		if(M<45) {
			if(H==0) {
				System.out.println(23+" "+(15+M));
			}else {
				System.out.println((H-1)+" "+(15+M));
			}
		}else {
			if(H==0) {
				System.out.println(H+" "+(M-45));
			}else {
				System.out.println(H+" "+(M-45));
			}
		}
	}
}
