import java.util.Scanner;
public class DistanceOfPoints {
	public static void main(String[] args) {
		
		//complete code for scanner below
		Scanner i = new Scanner(System.in);
		System.out.print("Enter x1 and y1: ");
		double x1 = i.nextDouble();
		double y1 = i.nextDouble();
		System.out.print("Enter x2 and y2: ");
		double x2 = i.nextDouble();
		double y2 = i.nextDouble();
		double dist = distance(x1,y1,x2,y2);
		System.out.print("The distance between the two points is " + dist);
	}
	
	//write the code distance() method below
	public static double distance(double x1, double y1, double x2, double y2) {
		double result = Math.pow(Math.pow(x2-x1,2)+Math.pow(y2-y1,2), 0.5);
		return result;
	}
}
