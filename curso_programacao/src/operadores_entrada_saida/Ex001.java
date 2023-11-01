package operadores_entrada_saida;

import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Nome completo:");
		String nome = sc.nextLine();
		System.out.println(nome);
		sc.close();

	}

}
