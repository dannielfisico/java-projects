package application;

import java.util.Locale;
import java.util.Scanner;

import entities.AccountLevel6;
import exceptions.BussinessExceptionsAccountL6;

public class BankL6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe os dados da conta:");
		System.out.print("Número: ");
		Integer number = sc.nextInt();
		sc.nextLine();
		System.out.print("Titular: ");
		String holder = sc.nextLine();
		System.out.print("Saldo: ");
		double initialDeposit = sc.nextDouble();
		System.out.print("");
		System.out.print("Limite de Saque: ");
		Double withdrawLimit = sc.nextDouble();
		
		AccountLevel6 account = new AccountLevel6(number, holder, initialDeposit, withdrawLimit);
		
		System.out.println();
		System.out.print("Informe a quantia a sacar: ");
		Double amount = sc.nextDouble();
		
		try {
			account.withdraw(amount);
			System.out.printf("Novo saldo: $ %.2f", account.getBalance());
		}
		catch (BussinessExceptionsAccountL6 e) {
			System.out.println(e.getMessage());
			
		}
		
		
		
		
		
		sc.close();

	}

}
