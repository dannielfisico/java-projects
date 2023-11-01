package funcoes;

import java.util.Locale;
import java.util.Scanner;

public class Calcular_area {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a media dos lados do retângulo");
		System.out.println("Largura:");
		double largura = teclado.nextDouble();
		System.out.println("Altura:");
		double altura = teclado.nextDouble();
		
		showArea(largura, altura);
		double perimetro = perimetro(largura, altura);
		System.out.println("Perímetro: "+perimetro+"cm");
		teclado.close();
	}

	private static void showArea(double l, double a) {
		double area = l * a;
		System.out.printf("A área do quadrado de lados %.2fcm x %.2fcm = %.2fcm²%n", l, a, area);
		
	}
	
	private static double perimetro(double a, double b) {
		double p = 2 * (a + b);
		return p;
	}

	

}
