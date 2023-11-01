import java.util.Scanner;

public class StringFuncoes2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite seu nome completo:");
		String nomeCompleto = teclado.nextLine();
		System.out.printf("O nome informado foi: %s%n", nomeCompleto);
		System.out.println("Uma palavra em cada linha:");
		String[] vetor = nomeCompleto.split(" ");
		
		for(int i = 0; i < vetor.length; i++) {
			String palavra = vetor[i];
			System.out.printf("%dª palavra: %s%n", i+1, palavra);
		}
		
		
		teclado.close();

	}

}
