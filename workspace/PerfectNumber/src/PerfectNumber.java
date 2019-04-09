import java.util.Scanner;
public class PerfectNumber {
	public static boolean isPerfect(int x) {
		int factor = 1;
		int sumFactor = 0;
		while (factor < x) {
			if (x % factor == 0) {
				sumFactor += factor;
			}
			factor++;
		}
		boolean bul = false;
		if (sumFactor == x) {
			bul = true;
		}
		return bul;
	}
	public static void main(String[] args) {
		System.out.print("Enter n: ");
		Scanner i = new Scanner(System.in);
		int n = i.nextInt();
		boolean result = isPerfect(n);
		if (result == true) {
			System.out.printf("%d is a perfect number", n);
		}
		else
			System.out.printf("%d is not a perfect number", n);
	}
}
