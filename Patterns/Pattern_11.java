import java.util.*;
public class Pattern_11 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextByte();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(i + " " + j + " ");
			}
			System.out.println();
		}
	}
}