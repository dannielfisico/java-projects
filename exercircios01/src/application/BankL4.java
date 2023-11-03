package application;

import java.util.Locale;
import java.util.Scanner;

public class BankL4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner osk = new Scanner(System.in);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("$$$$$$$$$$ BANK LEVEL 4 $$$$$$$$$$");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println();
		
		char response = '0';
		
		do {
			System.out.println("Bem vindo ao BANK LEVEL 4");
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
			System.out.println("Número da conta: ");
			
		}
		osk.close();

	}

}
