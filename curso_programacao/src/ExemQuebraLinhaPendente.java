import java.util.*;
public class ExemQuebraLinhaPendente {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int x;
		String frase1, frase2, frase3;
		
		x = teclado.nextInt();
		teclado.nextLine();
		frase1 = teclado.nextLine();
		frase2 = teclado.nextLine();
		frase3 = teclado.nextLine();
		
		
		teclado.close();
		
		System.out.printf("Dados Digitados%n");
		System.out.printf("%d%n", x);
		System.out.printf("%s%n", frase1);
		System.out.printf("%s%n", frase2);
		System.out.printf("%s%n", frase3);
		
	}

}
