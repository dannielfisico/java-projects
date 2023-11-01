package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class BankOfJava {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		BankAccount account;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		System.out.print("Is there na initil deposit (y/n)? ");
		char response = sc.next().charAt(0);
			if (response == 'y') {
				System.out.print("Enter initial deposit value: ");
				double initialDeposit = sc.nextDouble();
				account = new BankAccount(accountNumber, holder, initialDeposit);
			} else {
				account = new BankAccount(accountNumber, holder);
			}

		System.out.println();
		System.out.println("Accoutn data:");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a deposit value:");
		double amount = sc.nextDouble();
		account.deposit(amount);
		//System.out.println("Update account data:");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a withdraw value:");
		amount = sc.nextDouble();
		account.withdraw(amount);
		//System.out.println("Update account data:");
		//System.out.println(account.getMsg());
		System.out.println(account);
		System.out.println();
		
		
		
		sc.close();
	}

}
