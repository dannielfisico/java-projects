import java.util.Locale;
import java.util.Scanner;

public class conversor_de_temperatura2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		System.out.println("Conversor de Temperaturas");
		char resp;
		do {
			System.out.println("C: ");
			double C = teclado.nextDouble();
			double F = 9*C/5 +32;
			System.out.println("F: "+F);
			System.out.println("Deseja repetir (s/n)?");
			resp = teclado.next().charAt(0);
		} while (resp == 's');
		
		System.out.println("Fim...");
		
		teclado.close();
	}

}
