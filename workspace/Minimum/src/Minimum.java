import java.util.Scanner;
public class Minimum {
	public static int getMin(int n1, int n2, int n3) {
		return Math.min(Math.min(n1, n2), n3);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner i = new Scanner(System.in);
		System.out.print("Enter three integers: ");
		int n1 = i.nextInt();
		int n2 = i.nextInt();
		int n3 = i.nextInt();
		i.close();
		System.out.print("The minimum integer is " + getMin(n1, n2, n3));
	}

}
