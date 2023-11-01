import java.util.*;
public class Ex011Repeticao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int quantidade = 0;
		for(int i = 1; i <=20; i++) {
			int valor = teclado.nextInt();
			if(valor > 8) {
				quantidade++;
			}
		}
		teclado.close();
		System.out.printf("%d números são maiores que 8.", quantidade);
	}

}
