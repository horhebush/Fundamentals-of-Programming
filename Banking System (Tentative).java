package Laboratory;

import java.util.Scanner;
import java.util.ArrayList;

public class EXAMPLE {
	
	private static ArrayList<Account> accounts = new ArrayList<>();
	private static Account loggedInAccount = null;
	private static Scanner scn = new Scanner(System.in);
	
	public static void signUp() {
		System.out.println("=== Sign Up ===");
		System.out.print("Enter Desired Account Name: ");
		String accName = scn.nextLine();
		
		// Checks for duplicate name
		
		if (DuplicateName(accName))
			{
				System.out.println("Name is already taken, please consult the Bank...");
				return;
			}
		
		int accPass;
		do
			{
				System.out.print("Account Passcode (6-digits): ");
				while (!scn.hasNextInt())
					{
						System.out.print("Please Enter a Valid 6-digit Passcode " + "\n");
					}
				accPass = scn.nextInt();
				
				if (accPass < 100000 || accPass > 999999)
					{
						System.out.print("Please Enter a Valid 6-digit Passcode " + "\n");
					}
			}
		while (accPass < 100000 || accPass > 999999);
		
		// Function to put account details in the Array List
		Account account = new Account(accName, accPass);
		accounts.add(account);
		
		System.out.println("\nAccount created Successfully.\n");
	}
	
	public static void logIn() {
		System.out.println("=== Log In ===");
		System.out.print("Enter Your Account Name: ");
		String accName = scn.nextLine();
		
		System.out.println();
		
		System.out.print("Enter Your Passcode: ");
		int accPass = scn.nextInt();
		
		// Checks if Account is in the Array List
		loggedInAccount = searchAccount(accName, accPass);
		if (loggedInAccount != null)
			{
				// If it is in the Array List
				System.out.println("Login successful. Welcome, " + loggedInAccount.getName() + "\n");
			}
		else 
			{
				// If it isn't in the Array List
				System.out.println("Invalid Credentials. Please try again or sign up for a new account");
			}
	}
	
	public static void deposit() {
		if (loggedInAccount != null)
			{
				System.out.print("Enter ammount to deposit: ");
				double depAmmount = scn.nextDouble();
				
				loggedInAccount.deposit(depAmmount);
				System.out.println("\nDeposit Successful");
				System.out.println("Current Balance: " + loggedInAccount.getBalance());
			}
		else
			{
				System.out.println("Please log in first.\n");
			}
	}
	
	public static void withdraw() {
		if (loggedInAccount != null)
			{
				System.out.print("Enter ammoung to withdraw: ");
				double wthdAmount = scn.nextDouble();
				
				loggedInAccount.withdraw(wthdAmount);
				System.out.println("\nWithdraw Successful");
				System.out.println("Current Balance: " + loggedInAccount.getBalance());
			}
		else
			{
				System.out.println("Please log in first.\n");
			}
	}
	
	public static void checkBalance() {
		if (loggedInAccount != null)
			{
				System.out.println("Current Balance: " + loggedInAccount.getBalance());
			}
		else
			{
				System.out.println("Please log in first.\n");
			}
	}
	
	public static void displayAccDetails() {
		if (loggedInAccount != null)
			{
				System.out.println("Account Name: " + loggedInAccount.getName());
				System.out.println("Account Passcode: " + loggedInAccount.getPassCode());
				System.out.println("Current Balance: " + loggedInAccount.getBalance());
			}
		else
			{
				System.out.println("Please log in first.\n");
			}
	}
	
	private static boolean DuplicateName(String name) {
		for (Account account: accounts)
			{
				if (account.getName().equalsIgnoreCase(name))
					{
						return true;
					}
			}
		return false;
	}
	
	private static Account searchAccount(String name, int pass) {
		// Loops to find accounts in the Array List
		for (Account account: accounts)
		{
			if (account.getName().equalsIgnoreCase(name) && account.getPassCode() == pass)
				{
					return account;
				}
		}
	return null;
	}
	
	public static void main(String[] args) {
		int choice;
		do 
			{
				System.out.println("=== Welcome to your online bank ===");
				System.out.println("	1. Log In");
				System.out.println("	2. Sign Up");
				System.out.println("	3. Exit Program\n");
				System.out.print("Your Choice: ");
				choice = scn.nextInt();
				scn.nextLine();
				
				switch (choice)
					{
						case 1:
							logIn();
							break;
						case 2:
							signUp();
							break;
						case 3:
							System.out.println("Exiting Program");
							return;
						default:
							System.out.println("Invalid choice. Please try again.\n");
					}
					
				// Display after log in --- Banking options ---
				if (loggedInAccount != null)
					{
						do 
							{
								System.out.println("=== Choose an Option ===");
								System.out.println("	1. Deposit");
								System.out.println("	2. Withdraw");
								System.out.println("	3. Check Balance");
								System.out.println("	4. Account Details");
								System.out.println("	5. Log Out\n");
								System.out.print("Your Choice: ");
								choice = scn.nextInt();
								scn.nextLine();
						
								switch (choice)
									{
										case 1:
											deposit();
											break;
										case 2:
											withdraw();
											break;
										case 3:
											checkBalance();
											break;
										case 4:
											displayAccDetails();
											break;
										case 5:
											System.out.println("Loggin out....");
											loggedInAccount = null;
											return;
										default:
											System.out.println("Invalid choice. Please try again.\n");
									}
						
								// Prompt to another transaction
								if (choice != 5)
									{
										System.out.print("Do you want to do another transaction? [y/n]");
										char choiceC = scn.next().charAt(0);
										if (choiceC != 'y' && choiceC != 'Y') break;
									}
						
							} while (true);
				
					} 
			
			} while (choice != 3);
	}
}



class Account {
	private String accName;
	private int passCode;
	private double accBalance;
	
	public Account(String name, int passcode) {
		this.accName = name;
		this.passCode = passcode;
		this.accBalance = 0;
	}
	
	public String getName() {
		return accName;
	}
	
	public int getPassCode() {
		return passCode;
	}
	
	public double getBalance() {
		return accBalance;
	}
	
	public void deposit (double amount) {
		accBalance += amount;
	}
	
	public void withdraw (double amount) {
		accBalance -= amount;
	}
}
