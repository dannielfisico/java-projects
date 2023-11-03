package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

import entities.ProductsStore;

public class ExercicioArrayAula75 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("##### CADASTRO DE PRODUTOS ######");
		System.out.print("Quantos produtos deseja cadastrar? ");
		int quantity = sc.nextInt();
		sc.nextLine();
		
		ProductsStore[] vect = new ProductsStore[quantity];
		double sum = 0;	
			for(int i = 0; i < vect.length; i++) {
				System.out.printf("%nNome: ");
				String name = sc.nextLine();
				System.out.printf("Preço (%s): ", name);
				double price = sc.nextDouble();
				sc.nextLine();
				vect[i] = new ProductsStore(i, name, price);
				sum += price;
			}
		
			Arrays.stream(vect).forEach(System.out::println);
			System.out.println();
			//System.out.println(Arrays.toString(vect));
			System.out.printf("A média dos preços é: R$ %.2f%n", sum/vect.length);
			
		sc.close();

	}

}
