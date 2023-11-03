package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Alunos;

public class ExAbaixoDaMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner osk = new Scanner(System.in);
		
		
		System.out.print("Nome: ");
		String name = osk.nextLine();
		System.out.print("Quantas notas? ");
		int qtd = osk.nextInt();
		osk.nextLine();
		double[] notas = new double[qtd];
		
		Alunos aluno = new Alunos(name, notas);
		
		for(int i = 0; i < notas.length; i++) {
			System.out.printf("Nota %d de %s: ", i+1, name);
			notas[i] = osk.nextDouble();
			
		
		aluno.setNotas(notas);
		
			
		}
		
		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-");
		System.out.println(aluno);
		
		System.out.printf("A média é: %.2f%n", aluno.calcularMedia(notas));
		System.out.printf("Status: %s%n%s", aluno.resultadoFinal(aluno.calcularMedia(notas)) ,aluno.statusNotas(notas));
		
		
		osk.close();

	}

}
