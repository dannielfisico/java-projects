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
		sc.nextLine();
		double sum = 0;
		int lessThan16 = 0;
		
		Pessoa pessoa = null;
		
		Pessoa[] vect = new Pessoa[quantity];
			for(int i = 0; i< vect.length; i++) {
				System.out.printf("Dados da %dª pessoa:%n", i+1);
				System.out.print("Nome: ");
				String name = sc.nextLine();
				System.out.print("Idade: ");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.print("Altura: ");
				double heigth = sc.nextDouble();
				sc.nextLine();
				pessoa = new Pessoa(name, age, heigth);
				sum += 	heigth;
					if(pessoa.lessThan(age)) {
						lessThan16++;
					}
				}
			
			double percent = (double) lessThan16/vect.length;
			
			System.out.println();
			System.out.printf("Altura média = %.2fm%n", pessoa.average(sum, quantity));
			System.out.printf("Pessoas com menos de 16 anos: %d de %d (%.2f%%)" , lessThan16, vect.length, percent*100 );
		
		sc.close();

	}

}
