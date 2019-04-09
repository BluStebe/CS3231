import java.util.Scanner;
public class SmallestN {
	public static int smallestn(int x) {
		int result = 0;
		for (int n = 0; Math.pow(n, 2) < x; n++) {
			result = n;
		}
		return result + 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter x: ");
		Scanner i = new Scanner(System.in);
		int x = i.nextInt();
		i.close();
		int result = smallestn(x) -1;
		System.out.printf("%d is the lowest number, such that n^2 is greater than %d\n", result + 1, x);
		System.out.printf("Proof: %d^2 = %d\n", result, (int) Math.pow(result, 2));
		System.out.printf("Proof: %d^2 = %d", result + 1, (int) Math.pow(result+1, 2));
	}

}
