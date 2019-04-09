import java.util.Scanner;
public class PentagonalNumber {
	public static int getPentagonalNumber(int n) {
		return n*(3*n-1)/2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner i = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = i.nextInt();
		i.close();
		System.out.print("The first " + n + " pentagonal numbers are\n");
		int count = 1;
		while (count <= n) {
			for (int x = 0; x < 7; x++) {
				if (count <= n) {
					System.out.printf("%-8d", getPentagonalNumber(count));
					count++;
				}
				else {
					break;
				}
			}
			System.out.print("\n");
		}
	}

}
