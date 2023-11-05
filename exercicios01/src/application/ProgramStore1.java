package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductStore1;

public class ProgramStore1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner osk = new Scanner(System.in);
		
		
		System.out.println("Quantos produtos deseja cadastar? ");
		int quantity = osk.nextInt();
		osk.nextLine();
		
		ProductStore1[] vect = new ProductStore1[quantity];
		
		
			for(int i = 0; i < vect.length; i++) {
				System.out.printf("Nome do produto %d: ", i+1);
					String name = osk.nextLine();
				System.out.printf("Preço (%s): $ ", name);
					double price = osk.nextDouble();
					osk.nextLine();
					
				vect[i] = new ProductStore1(i+1, name, price);
			}
			
			double sum = 0;
			
			for(int i = 0; i < vect.length;i++) {
				System.out.println(vect[i].getId() +" - " + vect[i].getName() + " - $" + String.format("%.2f", vect[i].getPrice()));
				sum+= vect[i].getPrice();
			}
			
			
			double average = sum/quantity;
			
			System.out.printf("Preço médio $ %.2f\n", average);
			System.out.printf("Preço médio $ %.2f\n", sum/vect.length);
			
			
			
			
			
			
			
			
		
		osk.close();

	}

}
