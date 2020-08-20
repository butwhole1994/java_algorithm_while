//https://www.acmicpc.net/problem/1110
import java.util.*;
public class add_cycle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = n;
		//(10*(a%10))+(((a/10)+(a%10))%10);
		int cycle =0;
		
		do {
			++cycle;
			a=(10*(a%10))+(((a/10)+(a%10))%10);
		} while(a!=n);
		System.out.println(cycle);
	}
}
