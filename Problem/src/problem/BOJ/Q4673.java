package problem.BOJ;

public class Q4673 {

	public static void main(String[] args) {
		int[] noSelfNum=new int[10001];
		
		for(int i=1; i<10001;i++) {
			int sn=getSn(i);
			if(sn<=10000) {
				noSelfNum[i]=sn;
			}
		}
		
		for(int i=0; i<noSelfNum.length;i++) {
			if(!(noSelfNum[i]==0)) {
				System.out.println(noSelfNum[i]);
			}
		}
	}
	
	public static int getSn(int a) {
		int sn=a;
		while(a>0) {
			sn+=a%10;
			a/=10;
		}
		return sn;
	}

}
