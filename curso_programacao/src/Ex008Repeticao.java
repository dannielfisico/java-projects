import java.util.*;
public class Ex008Repeticao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int maiores = 0;
		for(int i = 1; i <= 20; i++) {
			System.out.printf("Idade %d%n", i);
			int valor = teclado.nextInt();
			if(valor >= 18) {
				maiores++;
			}
		}
		
		teclado.close();
		System.out.printf("%d pessoas maiores de idade.", maiores);

	}

}
