package baekjoon;

import java.util.Scanner;

public class B2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //ī���� ����
		int M = sc.nextInt(); //��ǥ 
		int[] card = new int[N]; //�Է¹��� ī���� ������ ��� �迭
		int[] sum = new int[N*(N-1)*(N-2)]; //N���� 3���� �̾� ���� ������ ��� �迭
		int answer=0; //M������ ���� ū ���� ���� ����
		for(int i=0;i<N;i++) {
			card[i]=sc.nextInt();
		}
		for(int i=0;i<N-2;i++) {
			for(int j=i+1;j<N-1;j++) {
				for(int k=j+1;k<N;k++) {
					sum[i+j+k-2]=card[i]+card[j]+card[k];
					if(sum[i+j+k-2]<=M && sum[i+j+k-2]>answer) {
						answer=sum[i+j+k-2];
					}
				}
			}
		}
		System.out.println(answer);
		sc.close();
	}
}
