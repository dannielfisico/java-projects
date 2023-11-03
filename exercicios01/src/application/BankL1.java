package application;

import java.util.Locale;
import java.util.Scanner;

import entities.AccountLevel1;


public class BankL1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//A variavel account será criada logo no inicio para ficar no escopo global da aplicação
		
		AccountLevel1 account;
		
		System.out.println("Bem vindo ao Banco Level 1");
		System.out.println("Cadastre uma nova conta.");
		System.out.print("Número da conta: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Nome do Titular: ");
		String client = sc.nextLine();
		System.out.println("Deseja fazer um depósito inical (s/n)? ");
		char response = sc.next().charAt(0);
			if(response == 'y'){
				System.out.print("Valor do depósito inicial: ");
				double initialDeposit = sc.nextDouble();
				account = new AccountLevel1(number, client, initialDeposit);
			} else {
				account = new AccountLevel1(number, client);
				
			}
			
			System.out.println();
			System.out.println(account);
			System.out.println();
			System.out.printf("%s, vamos realizar um depósito em sua nova conta.%n", account.getClient());
			System.out.println("Valor do depósito: ");
			double amount = sc.nextDouble();
			account.deposit(amount);
			//account.toString();
			System.out.println(account);
			
			System.out.println();
			System.out.printf("%s, vamos realizar um saque em sua nova conta.%n", account.getClient());
			System.out.println("Valor do saque: ");
			amount = sc.nextDouble();
			account.withdraw(amount);
			//account.toString();
			System.out.println(account);
		
		
		
		sc.close();

	}

}
