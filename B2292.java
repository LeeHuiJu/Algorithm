import java.util.Scanner;

public class B2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int roomLevel = 1; //�ּ�ĭ��
		int k=1; //�ּ�ĭ���� ���ϱ� ���� ��ȭ���
		for(int i=1;k<N;i++) {
			roomLevel++;
			k+=i*6;
		}
		System.out.println(roomLevel);
		sc.close();
	}
}
