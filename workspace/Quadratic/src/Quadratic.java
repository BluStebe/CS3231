import java.util.Scanner;
public class Quadratic {
	public static double discriminant(double a, double b, double c) {
		double result = Math.pow(b, 2) - 4 * a * c;
		return result;
	}
	public static double r1(double a, double b, double c) {
		double result = (-b + Math.sqrt(discriminant(a, b, c))) / (2 * a);
		return result;
	}
	public static double r2(double a, double b, double c) {
		double result = (-b - Math.sqrt(discriminant(a, b, c))) / (2 * a);
		return result;
	}
	
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		System.out.print("Enter a, b, c: ");
		double a = i.nextDouble();
		double b = i.nextDouble();
		double c = i.nextDouble();
		i.close();
		double newR1 = r1(a, b, c);
		double newR2 = r2(a, b, c);
		System.out.printf("The equation has two roots %.5f and %.5f", newR1, newR2);
	}

}
