package baekjoon;

import java.util.Scanner;

public class B11050 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int mul=1; //���ս��� ����
		int fac=1; //���ս��� �и�
		
		while(K>0) {
			mul*=N;
			fac*=K;
			N--;
			K--;
		}
		System.out.println(mul/fac);
		sc.close();
	}
}
