package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AppList1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Lista de números inteiros usando a Wrapprer Class Integer
		//Lista de texto usando Wreapper Calsse String (* não se pode usar tipos primitivos)
		//Generics está entre os síbomos <Generics>
		List<String> list = new ArrayList<>();
					
		char response = 's';
		
		do {
			System.out.print("Nome: ");
			String name = sc.nextLine();
			list.add(name);
			System.out.print("Deseja add mais um nome na lista (S/N)? ");
			response = sc.next().charAt(0);
			sc.nextLine();
		}while (response == 's' || response == 'S');
		
		//Imprimir no console cada elemento da lista
		System.out.println("\nNomes inseridos na lista");
		for(String nome : list) {
			System.out.println(nome);
			
		}
		
		
		
		sc.close();
	}

}
