package application;

import java.util.Locale;
import java.util.Scanner;

import entities.AccountLevel5;

public class BankL5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner osk = new Scanner(System.in);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("$$$$$$$$$$ BANK LEVEL 4 $$$$$$$$$$");
		System.out.println("$$$$$$$$$$  BEM VINDO   $$$$$$$$$$");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println();
		
		AccountLevel5 account;
		char response = '0';
		
		do {
			System.out.println("Serviços disponíveis:");
			System.out.println("(1) Abrir Conta \n(2) Sair do programa");
			System.out.println("Opção: ");
			response = osk.next().charAt(0);
			if(response == '1') {
				System.out.println("Então vamos abrir sua conta");
			} else if (response == '2') {
				System.out.println("Programa finalizado.");
				
			} else {
				System.out.println("Opção inválida, tente novamente");
				response = '0';
			}
			
		} while (response == '0');
		
		if (response == '1') {
			System.out.println("Informe os dados para criação da sua conta");
			System.out.print("Número da conta: ");
			int number = osk.nextInt();
			osk.nextLine();
			System.out.print("Nome do cliente: ");
			String client = osk.nextLine();
			System.out.println("Deseja realizar um depósito inicial (S/N)? ");
			response = osk.next().charAt(0);
				if(response == 'S' || response == 's') {
					System.out.print("Informe o valor do depósito inicial: ");
					double initialDeposty = osk.nextDouble();
					account = new AccountLevel5(number, client, initialDeposty);
				} else {
					account = new AccountLevel5(number, client);
				}

				//account.setMsg("Conta criada com sucesso.");
				System.out.print("\nDados da conta");
				System.out.println(account);
				System.out.println("\nServiços disponíveis para sua conta " + account.getClient());
			
				do {
					System.out.println("(1) DEPÓSITO \n(2) SAQUE\n(3) SAIR DO PROGRAMA");
					response = osk.next().charAt(0);
					if(response == '1') {
						System.out.print("Qual valor deseja depositar? ");
						double amount = osk.nextDouble();
						account.deposity(amount);
						System.out.println("#_#_#_#_Dados atualizados_#_#_#_#");
						//account.setMsg(String.format("Depósito de $%.2f realizado com sucesso.\n", amount));
						System.out.println(account);
						response ='0';
					} else if (response == '2') {
						System.out.println("Qual valor deseja sacar? ");
						double amount = osk.nextDouble();
						account.withdraw(amount);
						System.out.println("#_#_#_#_Dados atualizados_#_#_#_#");
						//account.setMsg(String.format("Saque de $%.2f realizado com sucesso.\n", amount));
						System.out.println(account);
						response ='0';
						
					} else if (response == '3') {
						System.out.printf("Até mais %s", account.getClient());
						response = '3';
					}
					
				} while (response == '0');
		}
		osk.close();

	}

}
