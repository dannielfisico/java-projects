/*
 1. Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
 */
import java.util.*;

public class Ex001 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Converter Anos, Meses e Dias em Dias");
		System.out.print("Anos: ");
		int anos = teclado.nextInt();
		System.out.print("Meses: ");
		int meses = teclado.nextInt();
		System.out.print("Dias: ");
		int dias = teclado.nextInt();
		int totalDias = anos * 365 + meses * 30 + dias;
		System.out.println("Total dias: "+ totalDias);
		
		
		
		teclado.close();

	}

}
