import java.util.*;
public class Ex015Repeticao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int soma = 0;
		int finalizar = 0;
		while (finalizar >= 0 ) {
			int valor = teclado.nextInt();
			if(valor >=0) {
				soma+= valor;				
			}
			finalizar = valor;
		} 
		
		System.out.printf("Soma: %d", soma);
		teclado.close();

	}

}
