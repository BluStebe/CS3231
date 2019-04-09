import java.util.Scanner;
public class BinaryToDecimal {
	public static int toDecimal(int n) {
		int p = 0;
		int decimal = 0;
		while(n!=0)
        {
            decimal+=((n%10)*Math.pow(2,p));
            n=n/10;
            p++;
        }
		return decimal;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a binary number: ");
		Scanner i = new Scanner(System.in);
		int start = i.nextInt();
		i.close();
		int result = toDecimal(start);
		System.out.printf("%s equals %d in decimal", start, result);
	}

}