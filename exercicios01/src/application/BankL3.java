package application;

import java.util.Locale;
import java.util.Scanner;

import entities.AccountLevel3;

public class BankL3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		AccountLevel3 account;
		
		System.out.println("#-#-#-# Bank Level 3 #-#-#-#");
		System.out.println("Caro usuário, vamos cadastar sua conta.");
		
		System.out.print("Número da conta: ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Titular: ");
		String client = sc.nextLine();
		String[] vectorClient = client.split(" ");
		System.out.printf("Caro cliente %s, deseja realizar seu primeiro depósito (S/N)? ", vectorClient[0]);
		char response = sc.next().charAt(0);
			if(response == 's' || response == 'S') {
				System.out.print("Qual o valor do depósito inicial? ");
				double initialDeposit = sc.nextDouble();
				account = new AccountLevel3(number, client, initialDeposit);
				System.out.println(account);
			} else {
				account = new AccountLevel3(number, client);
				System.out.println(account);
			}
		
			
		System.out.println();
		System.out.print("Deseja realizar alguma movimentação na conta (S/N)? ");
		char next = sc.next().charAt(0);	
			if(next == 'S' || next == 's') {
				do {
					System.out.printf("%nMovimentações disponíveis%n");
					System.out.print("Depósito ou Saque (D/S)? ");
					char moviment = sc.next().charAt(0);
					if (moviment == 'D' || moviment == 'd') {
						System.out.printf("%s, quanto deseja depositar? ",client);
						double amount = sc.nextDouble();
						
						account.deposit(amount);
						System.out.println(account);
						
						
					} else if (moviment == 'S' || moviment == 's'){
						System.out.printf("%s, quanto deseja sacar? (Saldo: R$ %.2f) ",client, account.getBalance());
						double amount = sc.nextDouble();
						account.withdraw(amount);
						System.out.println(account);
					}
					
					System.out.print("Deseja realizar alguma movimentação na conta (S/N)? ");
					next = sc.next().charAt(0);
					
				} while (next == 'S' || next == 's');
			}
			
			System.out.println("Obrigado por usar nosso aplicativo.");
		
		sc.close();

	}

}
