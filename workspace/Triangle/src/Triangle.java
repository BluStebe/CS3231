import java.util.InputMismatchException;
import java.util.Scanner;
public class Triangle {
	public static void main(String[] args) {
		try {
			Scanner i = new Scanner(System.in);
			System.out.println("Enter three points for a triangle: ");
			double x1 = i.nextDouble();
			double y1 = i.nextDouble();
			double x2 = i.nextDouble();
			double y2 = i.nextDouble();
			double x3 = i.nextDouble();
			double y3 = i.nextDouble();
			double area = computeArea(x1, y1, x2, y2, x3, y3);
			System.out.printf("The area of the triangle is %.1f", area);
		}
		catch(InputMismatchException ex) {
			System.out.println("incorrect input");
		}

	}
	public static double distance(double x1, double y1, double x2, double y2) {
		double result = Math.pow(Math.pow(x2-x1,2)+Math.pow(y2-y1,2), 0.5);
		return result;
	}
	public static double computeArea(double x1, double y1,double x2, double y2,double x3, double y3){
		double side1 = distance(x1, y1, x2, y2);
		double side2 = distance(x2, y2, x3, y3);
		double side3 = distance(x3, y3, x1, y1);
		double s = (side1 + side2 + side3)/2;
		double area = Math.pow(s*(s-side1)*(s-side2)*(s-side3), 0.5);
		return area;
	}
}
