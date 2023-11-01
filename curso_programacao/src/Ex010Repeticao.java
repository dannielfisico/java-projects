import java.util.*;
public class Ex010Repeticao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.printf("Criar Tabuada de Multiplicação %n");
		System.out.printf("Número: ");		
		int number = teclado.nextInt();
		for(int i = 1; i<= 10; i++) {
			int mult = number * 10;
			System.out.printf("%d x %d = %d%n",number, i, mult);
		}
		
		teclado.close();

	}

}
