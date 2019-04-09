import java.io.File;
import java.util.Scanner;

public class Random {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("Random.txt");
		Scanner i = new Scanner(file);
		double noOfNo = 0;
		int sumOfNo = 0;
		double aveOfNo = 0;
		while (i.hasNext()) {
			int nl = i.nextInt();
			noOfNo++;
			sumOfNo += nl;
		}
		aveOfNo = sumOfNo / noOfNo;
		System.out.printf("There are %d numbers in random.txt\n", (int) noOfNo);
		System.out.println("The sum of the numbers in random.txt is: " + sumOfNo);
		System.out.println("The average of the numbers in random.txt is: " + aveOfNo);
		i.close();
	}

}
