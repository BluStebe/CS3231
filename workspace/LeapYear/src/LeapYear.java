import java.util.Scanner;
public class LeapYear {
	public static boolean isLeap(double year) {
		boolean result= false;
		if ((year % 4 == 0) && (year % 100 != 0))
			result = true;
		if (year % 400 == 0)
			result = true;
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner i = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int yearChosen = i.nextInt();
		i.close();
		boolean result = isLeap(yearChosen);
		System.out.printf("%d is a leap year? %b", yearChosen, result);
	}
}
