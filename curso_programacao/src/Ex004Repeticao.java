import java.util.*;
public class Ex004Repeticao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Nome: ");
		String nome = teclado.nextLine();
		System.out.println("Repetições:");
		int num = teclado.nextInt();
		System.out.printf("%s, vou repetir isso %d vezes.%n", nome, num);
		for(int i = 1; i <= num; i++) {
			System.out.printf("%d - %s%n", i, nome);
		}
		teclado.close();
	}

}
