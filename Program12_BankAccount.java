package weeklyassignments;

class BankAccount_Management{
	private final String ACCOUNT_TYPE = "Savings";
	
	private long accountNumber;
	private String accountHolderName;
	private double balance;
	
	public BankAccount_Management(long accountNumber, 
								String accountHolderName,
								double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	public void getAccountType() {
		System.out.println("Account Details"
				+ "\n"
				+"-----------------");
		System.out.println("Account Type:"+ ACCOUNT_TYPE);
	}
	
	public void displayAccountDetails() {
		System.out.println("Account Number:"+ accountNumber);
		System.out.println("Account Holder Name:"+ accountHolderName);
		System.out.println("Account Balance:"+ balance);
	}
	
}

public class Program12_BankAccount {

	public static void main(String[] args) {

		BankAccount_Management obj = new BankAccount_Management(1234567,"Rahul",35000);
		obj.getAccountType();
		obj.displayAccountDetails();
	}

}
