import java.util.*;

public class Ex005Repeticao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int soma = 0;
		for(int i = 1; i <=10; i++) {
			System.out.printf("Número %d%n", i);
			int valor = teclado.nextInt();
			soma+= valor;
		}
		System.out.printf("Soma: %d", soma);
		teclado.close();

	}

}
