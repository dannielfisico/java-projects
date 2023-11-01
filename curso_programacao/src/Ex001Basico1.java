import java.util.*;
public class Ex001Basico1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ler Anos, Meses e Dias e converter em Dias");
		System.out.printf("%n%nAnos: ");
		int years = teclado.nextInt();
		System.out.printf("Meses: ");
		int months = teclado.nextInt();
		System.out.printf("Dias: ");
		int days = teclado.nextInt();
		int total = 365 * years + 30 * months + days;
		System.out.println("Total: "+total);
		
		teclado.close();
	}

}
