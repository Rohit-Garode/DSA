import java.util.*;
public class Pattern_2 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextByte();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}