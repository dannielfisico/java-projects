package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ExercicioFixacaoAula60 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		System.out.print("Qual a contação do dollar? ");
		double price = teclado.nextDouble();
		System.out.print("Quantos dollares serão comprados? ");
		double bought = teclado.nextDouble();
		
		System.out.printf("Este montante corresponde em reais = R$%.2f", CurrencyConverter.converter(price, bought));
		
		teclado.close();
	}

}
