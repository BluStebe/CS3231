import java.util.Scanner;
import java.util.InputMismatchException;
public class TestRectangle{
	public static void main(String[] args) {
		try {
			Scanner i = new Scanner(System.in);
		
		
			Rectangle r = new Rectangle();
			r.width = i.nextDouble();
			r.length = i.nextDouble();
			System.out.println("width = " + r.width);
			System.out.println("length = " + r.length);
			System.out.println("area = " + r.getArea());
			System.out.println("perimeter = "+ r.getPerimeter());
		}
		catch (InputMismatchException ex) {
			System.out.print("incorrect input");
		}
	}
}
