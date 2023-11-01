/*Crie um algoritmo que leia um número e calcule seu
fatorial.*/
import java.util.*;

public class Ex016Repeticao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.printf("Fatorial de: ");
		int valor = teclado.nextInt();
		teclado.nextLine();
		teclado.close();
		int x = valor;
		int f = x;
		while(x > 1) {
			f = f * (x - 1);
			x--;
		}
		System.out.printf("%d! = %d", valor, f);
	}

}
