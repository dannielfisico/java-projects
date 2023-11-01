import java.util.*;
public class Ex017Repeticao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Quantos fatorial deseja calcular?%n");
		int qtd = teclado.nextInt();
		teclado.nextLine();
		for(int i = 0; i < qtd; i++) {
			System.out.println("Número: ");
			int valor = teclado.nextInt();
			teclado.nextLine();
			int x = valor;
			int f = x;
			while(x > 1) {
				f = f * (x - 1);
				x--;
				
			}
			System.out.printf("%d! = %d%n", valor, f);
		}
		
		teclado.close();

	}

}
