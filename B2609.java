import java.util.Scanner;

public class B2609 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int gcd,lcm; //gcd�� �ִ�����, lcm�� �ּҰ����
		gcd = reFuncGcd(A,B);
		lcm = (A*B)/gcd;
		
		System.out.println(gcd);
		System.out.println(lcm);
		
	}
	public static int reFuncGcd(int a, int b) { //�ִ������� ���ϴ� ����Լ�
		if(b==0)
			return a;
		return reFuncGcd(b,a%b);
	}
	
}
