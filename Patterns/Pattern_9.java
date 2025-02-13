import java.util.*;
public class Pattern_9 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextByte();
		int val = 0;
		for (int i = 1; i <= n; i++) {
			val = i;
			for (int j = 1; j<= n; j++) {
				System.out.print(val + "\t");
				val += i;
			}
			System.out.println();
		}
	}
}