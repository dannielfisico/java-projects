/*3. Informar um saldo e imprimir o saldo com reajuste de 1%.*/

import java.util.Scanner;

public class Ex003 {

	public static void main(String[] args) {
		Scanner teclado =  new Scanner(System.in);
		System.out.println("Informe o saldo:");
		double saldo = teclado.nextDouble();
		double reajuste = saldo * 0.01;
		double novoSaldo = saldo + reajuste;
		System.out.printf("O antigo saldo era de R$ %.2f e com o reajuste de 1%% foi para R$ %.2f", saldo, novoSaldo);
		teclado.close();

	}

}
