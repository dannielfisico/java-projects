import java.util.*;
public class Ex006Repeticao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int somaIdade = 0;
		for(int i = 1; i<=20; i++) {
			System.out.printf("Idade %d%n", i);
			int valor = teclado.nextInt();
			somaIdade+= valor;
		}
		System.out.printf("Soma: %d", somaIdade);
		
		teclado.close();
	}

}
