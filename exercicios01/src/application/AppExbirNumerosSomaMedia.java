package application;

import java.util.Locale;
import java.util.Scanner;

public class AppExbirNumerosSomaMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner osk = new Scanner(System.in);
		System.out.print("Quantos números deseja armazenar no vetor? ");
		int quantity = osk.nextInt();
		int[] numbers = new int[quantity];
		double sum = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.printf("Número %d de %d: ", i+1, quantity);
			numbers[i] = osk.nextInt();
			sum += numbers[i];
		}
		System.out.print("Números:");
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		double media = sum/numbers.length;
		
		System.out.print("\nSoma: "+ sum);
		System.out.print("\nMédia: " + String.format("%.2f", media));
		
		
		
		osk.close();
	}

}
