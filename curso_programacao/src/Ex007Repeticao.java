import java.util.*;

public class Ex007Repeticao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int soma = 0;
		
		for(int i = 1; i <=20; i++) {
			System.out.printf("Idade %d%n", i);
			int valor = teclado.nextInt();
			soma+= valor;
			
		}
		float media = (soma/20);
		teclado.close();
		System.out.printf("Média: %.2f anos.", media);

	}

}
