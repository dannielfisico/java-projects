package application;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner osk = new Scanner(System.in);
		System.out.print("Quantos número você deseja digitar? ");
		int quantity = osk.nextInt();
		osk.nextLine();
		int[] numbers = new int[quantity];
		for(int i = 0;i < numbers.length; i++) {
			System.out.print("Digie um número: ");
			numbers[i] = osk.nextInt();
		}
		
		
		System.out.println("NÚMEROS NEGATIVOS:");
		for(int i = 0;i < numbers.length; i++) {
			if(numbers[i] < 0) {
				System.out.println(numbers[i]);
			}
		}
		
		
		osk.close();
	}

}
