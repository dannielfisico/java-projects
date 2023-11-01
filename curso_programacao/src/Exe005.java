import java.util.*;

public class Exe005 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Valor do salário: R$");
		float salario = teclado.nextFloat();
		float salMinimo = 788f;
		float multiplicador = salario/salMinimo;
		System.out.printf("O salário de R$%.2f equivale a %.3f salários", salario, multiplicador);
		
		teclado.close();
	}

}
