import java.util.*;

public class Casting {

	public static void main(String[] args) {
		System.out.println("Casting");
		int x;
		double y;
		
		x = 5;
		y = 2 * x;
		
		System.out.println("X: "+x);
		System.out.println("Y: "+y);
		
		int quantidade = 50;
		double numero = 30.0;
		
		quantidade = (int) numero;
		
		System.out.printf("A nova quantidade é: %d%n%n", quantidade);
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calcular a área de um trapézio");
		System.out.print("Medida da base1: ");
		double base1 = teclado.nextDouble();
		System.out.print("Medida da base2: ");
		double base2 = teclado.nextDouble();
		System.out.print("Medida da altura: ");
		double altura = teclado.nextDouble();
		System.out.printf("Base1: %.2f cm%nBase2: %.2f cm%nAltura: %.2f cm%n", base1, base2, altura);
		double areaTrapezio = ((base1 + base2)*altura)/2;
		System.out.printf("A área do trapézio é: %.2f cm²", areaTrapezio); 
		teclado.close();
	}

}
