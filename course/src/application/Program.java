package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Triangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Entre com as medidas do Triangulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com as medidas do Triangulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areaX = x.area();
		double perimetroX = x.perimetro();
		double areaY = y.area();
		double perimetroY = y.perimetro();
		double diferenca = Math.abs(areaX - areaY);  
		
		System.out.printf("A área do Triângulo X é: %.2fcm² e o perímetro é %.2fcm %n", areaX, perimetroX);
		System.out.printf("A área do Triângulo Y é: %.2fcm² e o perímetro é %.2fcm %n", areaY, perimetroY);
		System.out.printf("A diferenca é: %.2fcm²%n", diferenca);
		
		if(areaX > areaY) {
			System.out.println("Area do triangulo X é maior");
		} else {
			System.out.println("Area do triangulo Y é maior");
			
		}
		
		System.out.println("Fim do programa.");
		
		sc.close();
	}

}
