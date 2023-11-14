package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.BussinessExceptions;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Informe os dados da conta");
		System.out.print("Número: ");
		Integer number = sc.nextInt();
		sc.nextLine();
		System.out.print("Titular: ");
		String holder = sc.nextLine();
		System.out.print("Saldo inicial: ");
		Double balance = sc.nextDouble();
		sc.nextLine();
		System.out.print("Limite de saque: ");
		Double withdrawLimit = sc.nextDouble();
		sc.nextLine();
		
		Account account = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println();
		System.out.print("Informe a quantia para sacar: ");
		Double amount = sc.nextDouble();
		
		
			
			 try {
				account.withdraw(amount);				
				System.out.printf("Novo saldo: %.2f\n", account.getBalance());
			}
			 catch (BussinessExceptions e) {
				System.out.println(e.getMessage());
			}
		
		sc.close();
	}

}
