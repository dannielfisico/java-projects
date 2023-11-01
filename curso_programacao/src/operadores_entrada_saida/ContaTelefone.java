package operadores_entrada_saida;

import java.util.Scanner;

public class ContaTelefone {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int minutos = teclado.nextInt();
		
		double conta = 50.0;
		
		if(minutos > 100) {
			conta+= (minutos - 100) * 2.0;
		}
		
		System.out.printf("Valor da conta: R$ %.2f", conta);
		teclado.close();

	}

}
