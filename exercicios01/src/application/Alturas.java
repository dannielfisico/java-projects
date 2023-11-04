package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serão digitadas? ");
		int quantity = sc.nextInt();
		Pessoa[] pessoa = new Pessoa[quantity];
			for(int i = 0; i< pessoa.length; i++) {
				System.out.printf("Dados da %dª pessoa:%n", i+1);
				
			}
		
		
		sc.close();

	}

}
