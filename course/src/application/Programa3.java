package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class Programa3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		System.out.print("Salario Bruto:");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.print("Taxas:");
		funcionario.deducoes = sc.nextDouble();
		System.out.println();
		
		System.out.printf("Funcionário: %s, $ %.2f%n", funcionario.nome, funcionario.salarioLiquido());
		System.out.println();
		System.out.println("Qual a porcentagem para aumentar o salário?");
		double percentage = sc.nextDouble();
		System.out.println();
		System.out.printf("Dados atualizados: %s, $ %.2f", funcionario.nome, funcionario.aumentarSalarioBruto(percentage));
		
		sc.close();

	}

}
