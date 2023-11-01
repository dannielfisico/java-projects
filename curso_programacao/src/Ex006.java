import java.util.*;
public class Ex006 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe um número inteiro:");
		int num = teclado.nextInt();
		int antecessor = num-1;
		int sucessor = num+1;
		System.out.printf("[%d] - Antecessor: %d - Sucessor: %d", num, antecessor, sucessor);
		
		teclado.close();

	}

}
