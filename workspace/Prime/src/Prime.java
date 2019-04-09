import java.util.Scanner;
public class Prime {
	public static boolean isPrime(int n) {
	    if (n%2==0 || n==1) return false;
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner i = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = i.nextInt();
		i.close();
		System.out.print("The first " + n + " prime numbers are\n");
		int x = 1;
		System.out.print(x);
		System.out.print(n);
		while (x <= 50) {
			System.out.print("hello\n");
			int y = 0;
			while (y < 10) {
				y++;
				if (x <= n) {
					if (isPrime(x) == true) {
						System.out.printf("%-8d", x);
						x++;
					}
				}
				else {
					continue;
				}
			}
		}
	}
}
