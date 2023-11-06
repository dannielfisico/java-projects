package application;

import java.util.Locale;
import java.util.Scanner;

import entities.PessoaInfo;

public class AppPessoaInfo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner osk = new Scanner(System.in);
		System.out.print("Quantas pessoas serão digitadas: ");
		int quantity = osk.nextInt();
		osk.nextLine();
		
		PessoaInfo[] pessoa = new PessoaInfo[quantity];
		
		for(int i = 0; i < pessoa.length; i++) {
			System.out.printf("Dados da %dª pessoa:\n", i+1);
			System.out.print("Nome: ");
			String name = osk.nextLine();
			System.out.print("Idade: ");
			int age = osk.nextInt();
			System.out.print("Altura: ");
			double heigth = osk.nextDouble();
			osk.nextLine();
			
			pessoa[i] = new PessoaInfo(name, age, heigth);
		}
		double sum = 0.0;
		
		for(int i = 0; i < pessoa.length; i++) {
			sum+= pessoa[i].getHeigth();
		}
		
		double average = sum / pessoa.length;
		System.out.printf("A altura média das pessoas é: %.2fm\n", average);
		
		int menos = 0;
		for(int i = 0; i < pessoa.length; i++) {
			if(pessoa[i].getAge() < 16) {
				menos++;
			}
		}
		
		double percent = menos * 100 / pessoa.length;
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);
		System.out.println("Lista das pessoas com menos de 16 anos: ");
		for(int i = 0; i < pessoa.length; i++) {
			if(pessoa[i].getAge() < 16) {
				System.out.println(pessoa[i].getName());
			}
		}
		
		
		osk.close();
	}

}
