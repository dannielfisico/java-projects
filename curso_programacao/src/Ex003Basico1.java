import java.util.Scanner;

public class Ex003Basico1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.printf("Informe o Saldo: R$");
		double saldo = teclado.nextDouble();
		double reajuste = saldo + (saldo * 0.01);
		System.out.printf("O reajuste será de 1%%...%nSeu noso saldo será: R$%.2f", reajuste);
		
		teclado.close();

	}

}
