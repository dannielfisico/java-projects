import java.util.*;

public class Ex003Repeticao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Nome: ");
		String nome = teclado.nextLine();
		for(int i = 1; i<=10; i++) {
			System.out.printf("%d - %s%n", i, nome);
		}
		
		
		teclado.close();

	}

}
