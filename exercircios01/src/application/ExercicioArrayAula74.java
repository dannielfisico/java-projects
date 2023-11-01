package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioArrayAula74 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Somar alturas e calcular a média");
		System.out.print("Quantas pessoas? ");
		int npessoas = sc.nextInt();
		double[] alturas = new double[npessoas];
		
		double soma = 0;
		
			for(int i = 0; i < npessoas; i++) {
				System.out.printf("Altura da pessoa %d: ",i+1);
				alturas[i] = sc.nextDouble();
				soma+= alturas[i];
			}
		
		double media = soma/npessoas;
		
		System.out.printf("%nA médias das alturas é: %.2fm",media);
		
		
		sc.close();
	}

}
