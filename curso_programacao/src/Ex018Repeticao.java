import java.util.*;
public class Ex018Repeticao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double valor = Integer.MAX_VALUE;
		double soma = 0;
		double produto = 1;
		while(valor >0) {
			System.out.printf("Digite um número: ");
			double numero = sc.nextDouble();
			sc.nextLine();
			if(numero%2 == 0) {
				soma+= numero;
				valor = numero;
			} else {
				produto = produto * numero;
				valor = numero;
			}
		}
		System.out.printf("A soma dos pares é %.0f%nO produto dos ímpares é %.0f.",soma, produto);
		
		sc.close();

	}

}
