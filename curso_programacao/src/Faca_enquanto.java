import java.util.Locale;
import java.util.Scanner;

public class Faca_enquanto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		double c = 0;
		char res = 's';
		
		do {
			System.out.println("Digite a temperatura em Celsius: ");
			c = teclado.nextDouble();
			double f = (9 * c)/5 +32;
			System.out.printf("O equivalente em Fahrenheit é: %.2f%n", f);
			System.out.println("Deseja repetir? (S / N): ");
			res = teclado.next().charAt(0);
			teclado.nextLine();
		} while (res == 'S' || res == 's');
		
		teclado.close();
		System.out.println("Programa finalizado...");

	}

}
