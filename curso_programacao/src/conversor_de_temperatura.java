import java.util.Locale;
import java.util.Scanner;

public class conversor_de_temperatura {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); // Atalho para importar(Ctrl + Shift + O)
		
		System.out.println("Conversor de Celsius para Fahrenheite");
		char resp = 's';

		while (resp == 's') {
			System.out.print("Digite a temperatura em Celsius: ");
			double C = sc.nextDouble();
			double F = 9 * C / 5 + 32;
			System.out.printf("%.2f°C em Fahrenheit equivale a %.2fF%n", C, F);
			System.out.println("Deseja repetir (s/n)?");
			resp = sc.next().charAt(0);
		}
		System.out.println("Programa finalizado...");
		sc.close();
	}

}
