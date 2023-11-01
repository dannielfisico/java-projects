import java.util.*;
public class Ex013Repeticao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int quantidade = 0;
		for(int i = 1; i <=10; i++) {
			int valor = teclado.nextInt();
			if(valor>=0 && valor <=100) {
				quantidade++;
			}
		}
		teclado.close();
		System.out.printf("%d  números estão entre 0 e 100", quantidade);
	}

}
