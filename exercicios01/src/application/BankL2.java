package application;

import java.util.Locale;
import java.util.Scanner;

import entities.AccountLevel2;

public class BankL2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("######### BANCO LEVEL 2 ###########");
		
		AccountLevel2 account;
		
		System.out.println("Informe os dados para criação da conta");
		System.out.print("Número da conta: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Nome do titular: ");
		String client = sc.nextLine();
		System.out.print("Deseja efetuar algum depósito inicial (s/n)? ");
		char resp = sc.next().charAt(0);
			if(resp == 's' || resp == 'S') {
				System.out.print("Qual o valor do depósito inicial? ");
				double initialDeposit = sc.nextInt();
				account = new AccountLevel2(number,client,initialDeposit);
			} else {
				account = new AccountLevel2(number, client);
			}
			
			System.out.printf("%n%s, sua conta foi criada com sucesso.%nDados da conta:%n%s%n",account.getClient(),account);
			System.out.println();
		
		char response = 'n';
		
		do {
			System.out.println("O que deseja realizar em sua conta?");
			System.out.print("Depósito ou Saque (d/s)? ");
			char moviment = sc.next().charAt(0);
				if(moviment == 's' || moviment == 'S') {
					System.out.printf("Qual valor do saque? (Saldo: R$ %.2f) ",account.getBalance());
					double amount = sc.nextDouble();
					account.withdraw(amount);
					//System.out.printf("%nSaqueiiii de R$ %.2f realizado com sucesso.%nDados atualizados:%n%s",amount,account);
				} else if (moviment == 'd' || moviment == 'D') {
					System.out.print("Qual valor do depósito? ");
					double amount = sc.nextDouble();
					account.deposit(amount);
					System.out.printf("%nDepósito de R$ %.2f realizado com sucesso.%nDados atualizados:%n%s",amount,account);
				}
				
			System.out.println();	
			System.out.print("Deseja realizar mais alguma movimentação (s/n)? ");
			response = sc.next().charAt(0);
		} while (response == 's' || response == 'S');
		
		System.out.printf("%nObrigado por usar nossos serviços.");
		
		sc.close();

	}

}
