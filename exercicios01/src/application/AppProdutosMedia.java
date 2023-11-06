package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProdutosMedia;

public class AppProdutosMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner osk = new Scanner(System.in);
		
		System.out.print("Quantos produtos deseja cadastrar: ");
		int quantity = osk.nextInt();
		osk.nextLine();
		ProdutosMedia[] vect = new ProdutosMedia[quantity];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.printf("Produto #%d: ", i+1);
			String name = osk.nextLine();
			System.out.print("Preço: ");
			double price = osk.nextDouble();
			osk.nextLine();
			vect[i] = new ProdutosMedia(name, price);
			System.out.println();
		}
		
		int sum = 0;
		
		for(int i = 0; i < vect.length; i++) {
			sum+= vect[i].getPrice();
		}
		
		vect[0].average(sum, quantity);
		System.out.println("A média de preços é R$ " + vect[0].average(sum, quantity));
		
		
		
		osk.close();

	}

}
