
public class BankAccount {
	private String accNumber, accHolder;
	private double accBalance = 0;
	static int numAccount = 0;
	BankAccount(String NEWaccNumber, String NEWaccHolder, double NEWaccBalance) {
		
		if (NEWaccNumber.matches("[0-9][0-9][0-9]-[0-9][0-9][0-9][0-9][0-9]-[0-9]")==false)
			System.out.println("Error: Account number is in format XXX-XXXXX-X");
		else if (NEWaccBalance < 500)
			System.out.println("Error: Minimum balance is $500");
		else {
			accNumber = NEWaccNumber;
			accHolder = NEWaccHolder;
			accBalance = NEWaccBalance;
			numAccount++;
		}
	}
	public double getBalance() {
		return accBalance;
	}
	public static int getNumAccount() {
		return numAccount;
	}
	public void deposit(double money) {
		if (money > 0)
			accBalance += money;
	}
	public void withdraw(double money) {
		if (money <= accBalance) {
			accBalance -= money;
		}
	}
}
