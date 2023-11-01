import java.util.*;

public class Ex004 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Porcentagem do IPI:");
		float ipi = teclado.nextFloat();
		System.out.println("Código da peça1:");
		String cod1 = teclado.next();
		System.out.println("Valor da peça1: R$");
		float valor1 = teclado.nextFloat();
		System.out.println("Quantidade da peça1:");
		int qtd1 = teclado.nextInt();
		System.out.println("Código da peça2:");
		String cod2 = teclado.next();
		System.out.println("Valor da peça2: R$");
		float valor2 = teclado.nextFloat();
		System.out.println("Quantidade da peça2:");
		int qtd2 = teclado.nextInt();
		float total1 = valor1 * qtd1;
		float total2 = valor2 * qtd2;
		float totalPagar = (total1 + total2)*(ipi/100 + 1);
		System.out.println("Cód - Preço - Qtd - Valor");
		System.out.printf("%s - R$%.2f - %d - R$%.2f%n", cod1, valor1, qtd1, total1);
		System.out.printf("%s - R$%.2f - %d - R$%.2f%n", cod2, valor2, qtd2, total2);
		System.out.printf("Total a pagar: R$ %.2f", totalPagar);
		
		
		teclado.close();
	}

}
