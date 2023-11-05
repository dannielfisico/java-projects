package application;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaExemplo1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas notas? ");
		int n = sc.nextInt();
		double sum = 0;
		double[] vect = new double[n];
		for(int i = 0; i < n; i++) {
			System.out.printf("%dª nota: ", i+1);
			vect[i] = sc.nextDouble();
			sum+= vect[i];
		}
		
		System.out.printf("A média é %.2f", sum/n);
		
		
		sc.close();

	}

}
