import java.util.*;
public class Pattern_4 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextByte();
		for (int i = n; i >= 1; i--) {
			for (int j=n; j>=1; j--) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}