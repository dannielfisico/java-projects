package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aluno;

public class Programa4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluno aluno = new Aluno();
		
		aluno.nome = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		aluno.status();
		
		
		sc.close();

	}

}
