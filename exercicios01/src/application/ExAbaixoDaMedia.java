package application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

import entities.Alunos;

public class ExAbaixoDaMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner osk = new Scanner(System.in);
		
		Alunos aluno;
		char response = 'n';
		
		do {
		
		System.out.print("Nome: ");
		String name = osk.nextLine();
		System.out.print("Quantas notas? ");
		int qtd = osk.nextInt();
		osk.nextLine();
		double[] notas = new double[qtd];
		
		
			for(int i = 0; i < notas.length; i++) {
				aluno = new Alunos(i,name, notas);
				System.out.printf("Nota %d de %s: ", i+1, name);
				notas[i] = osk.nextDouble();
		
				aluno.setNotas(notas);
				aluno.calcularMedia(notas);
			}
			
			
		System.out.print("\nDeseja cadastrar outro aluno (S/N)? ");
		response = osk.next().charAt(0);
		osk.nextLine();
			if(response == 's' || response == 'S') {
				response ='s';
			} else {
				response = 'n';
			}
		
		} while (response == 's' || response == 'S');
		
		System.out.println(aluno);

		osk.close();

	}

}
