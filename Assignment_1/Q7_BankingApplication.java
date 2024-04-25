/*Q7. Consider a scenario where you are tasked with developing a simple banking application 
using Java, employing the concept of polymorphism. Your application should consist of three 
classes: Account, SavingsAccount, and CurrentAccount. The Account class serves as the 
base class with private attributes for account number and balance, along with abstract methods 
for deposit and withdrawal. The SavingsAccount class, a subclass of Account, should include 
an additional attribute for interest rate and override the deposit method to calculate interest, as 
well as override the withdrawal method to ensure a sufficient balance. Similarly, the 
CurrentAccount class, also a subclass of Account, should incorporate an overdraft limit 
attribute and override the withdrawal method to check the overdraft limit. Implement the 
classes as described, ensuring proper encapsulation and abstraction. Finally, create a 
BankingApplication class (Main) to demonstrate the polymorphic behavior by creating 
instances of both SavingsAccount and CurrentAccount, testing deposit and withdrawal 
operations, and displaying account details.*/
package oops;

abstract class Account {
	private int accountNumber;
	protected double balance;

	public Account(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public abstract void deposit(double amount);

	public abstract void withdraw(double amount);
}

class SavingsAccount extends Account {
	private double interestRate;

	public SavingsAccount(int accountNumber, double balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	@Override
	public void deposit(double amount) {
		balance += amount + (amount * interestRate / 100);
		System.out.println("Interest is:"+interestRate*amount);
	}

	@Override
	public void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
		} else {
			System.out.println("Insufficient balance for withdrawal.");
		}
	}
}

class CurrentAccount extends Account {
	private double overdraftLimit;

	public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
		super(accountNumber, balance);
		this.overdraftLimit = overdraftLimit;
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
	}

	@Override
	public void withdraw(double amount) {
		if (balance + overdraftLimit >= amount) {
			balance -= amount;
		} else {
			System.out.println("Withdrawal amount exceeds overdraft limit.");
		}
	}
}

public class Q7_BankingApplication {
	public static void main(String[] args) {
		SavingsAccount savingsAccount = new SavingsAccount(1001, 5000, 5);
		CurrentAccount currentAccount = new CurrentAccount(2001, 10000, 2000);

		savingsAccount.deposit(2000);
		savingsAccount.withdraw(1000);

		currentAccount.deposit(3000);
		currentAccount.withdraw(15000);

		displayAccountDetails(savingsAccount);
		displayAccountDetails(currentAccount);
	}

	public static void displayAccountDetails(Account account) {
		System.out.println("Account Number: " + account.getAccountNumber());
		System.out.println("Balance: " + account.getBalance());
		if (account instanceof SavingsAccount) {
			SavingsAccount savingsAccount = (SavingsAccount) account;
			System.out.println("Interest Rate: " + savingsAccount.getInterestRate() + "%");
		} else if (account instanceof CurrentAccount) {
			CurrentAccount currentAccount = (CurrentAccount) account;
			System.out.println("Overdraft Limit: " + currentAccount.getOverdraftLimit());
		}
		System.out.println();
	}
}
