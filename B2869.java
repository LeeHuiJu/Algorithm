import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class B2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //��ü ����
		StringTokenizer st = new StringTokenizer(br.readLine()," "); //����� �Է������� ���⸦ �������� ���� �޽��ϴ�.
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		int nowHeight=0;
		int day=1;
		
		while(true) {
			nowHeight+=A;
			if(nowHeight>=V) {
				break;
			}
			nowHeight-=B;
			day++;
		}
		System.out.println(day);
	}
}
