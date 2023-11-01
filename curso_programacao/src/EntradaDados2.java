import java.util.*;

public class EntradaDados2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Idade:");
		int x = teclado.nextInt();
		System.out.println("Gênero(M ou F):");		
		char gender = teclado.next().charAt(0);
		teclado.nextLine();
		System.out.println("Ocupação:");
		String frase1 = teclado.nextLine();
		System.out.println("Cidade:");
		String frase2= teclado.nextLine();
		System.out.println("Endereço: ");
		String frase3 = teclado.nextLine();
		System.out.println("Dados Digitados:");
		System.out.printf("%d%n%c%n%s%n%s%n%s%n",x, gender, frase1, frase2, frase3);
		
		teclado.close();

	}

}
