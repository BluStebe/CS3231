import java.util.Scanner;

public class Energy {
	public static void main(String[] args) {
		
		Scanner i = new Scanner(System.in);
		System.out.print("Enter the amount of water in kilograms: ");
		double w = i.nextDouble();
		System.out.print("Enter the initial temperature: ");
		double it = i.nextDouble();
		System.out.print("Enter the final temperature: ");
		double ft = i.nextDouble();
		
		double energy = calculateEnergy(w,it,ft);
		
		System.out.printf("Energy: %.1f", energy); //complete code here to format printout
	}
	
	public static double calculateEnergy(double w, double i, double f){
		//complete code here for calculation
		double Q = w * (f - i) * 4184;
		return Q;
	}
	
}
