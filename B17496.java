import java.util.Scanner;

public class B17496 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //������ �� ��
		int T = sc.nextInt(); //�ڶ�µ� �ɸ��� �� ��
		int C = sc.nextInt(); //���� �� �ִ� ĭ�� ��
		int P = sc.nextInt(); // ���� ����
		
		int total = (N-1) / T * C; //�Ⱓ������ �� ����
		
		System.out.println(total * P);
		sc.close();
	}
}
