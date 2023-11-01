package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Retangle;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangle r = new Retangle();
		
		System.out.println("Informe as medidas do retângulo\nLargura: ");
		r.width  = sc.nextDouble();
		System.out.println("Altura: ");
		r.height = sc.nextDouble();
		
			
		System.out.printf("Área: %.2fcm²%n", r.area());
		System.out.printf("Perímetro: %.2fcm%n", r.perimeter());
		System.out.printf("Diagonal: %.2fcm%n", r.diagonal());
		
		sc.close();

	}

}
