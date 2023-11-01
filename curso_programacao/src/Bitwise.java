import java.util.Scanner;

public class Bitwise {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Bitwase");
		int mask = 0b00100000;
		int n = 0;
		char res;
		do {
			System.out.println("Informe um número: ");			
			n = teclado.nextInt();
			if((n & mask ) != 0) {
				System.out.println("O 6º bit é verdadeiro");
			} else {
				System.out.println("O 6º bit é falso");
				
			}
			System.out.println("Novo teste (s/n)? ");
			res = teclado.next().charAt(0);
			
		} while (res == 's' );
				
		teclado.close();
		System.out.println("Programa finalizado!");

	}

}
