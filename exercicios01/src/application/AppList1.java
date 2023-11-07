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
		System.out.println("Digite alguns nomes de pessoas");
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
		
		System.out.println("Tamanho da lista: "+ list.size());
		System.out.println("Vamos inseir novas pessoas na Lista");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.printf("Em que posição deseja add %s? ", name);
		int position = sc.nextInt();
		sc.nextLine();
		list.add(position, name);
		System.out.println("Veja como ficou sua lista agora:");
		for(String n : list) {
			System.out.println(n);
		}
		System.out.println("Tamanho da lista: "+ list.size());
		System.out.println("Vamos remover elementos da lista");
		System.out.println("Informe o nome que deseja remover: ");
		String nameToRemove = sc.nextLine();
		list.remove(nameToRemove);
		System.out.println("Lista atualizada:");
		for(String names : list) {
			System.out.println(names);
		}
		
		System.out.println("Usando o removeIf");
		System.out.print("Informe a primeira letra dos nomes a serem removidos: ");
		char letra = sc.next
		
		sc.close();
	}

}
