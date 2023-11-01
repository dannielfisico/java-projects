import java.util.Scanner;

public class StringFuncoes {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma frase...");
		String frase = "Daniel Alves estuda linguagem JAVA.";
		String fraseMaiuscula = frase.toUpperCase();
		String fraseMinuscula = frase.toLowerCase();
		String fraseSubstring = frase.substring(2);
		String fraseReplace = frase.replace("estuda", "é pleno em");
		int i = frase.indexOf(" ");
		String frasePrimeiraPalavra = frase.substring(0,i);
		String fraseSubstringI = frase.substring(i+1);
		int i2 = fraseSubstringI.indexOf(" ");
		String fraseSegundaPalavra = fraseSubstringI.substring(0, i2);
		
		
		System.out.printf("Original: %s%n",frase);
		System.out.printf("Maiúscula: %s%n", fraseMaiuscula);
		System.out.printf("Minúscula: %s%n", fraseMinuscula);
		System.out.printf("Substring(2): %s%n", fraseSubstring);
		System.out.printf("Replace: %s%n", fraseReplace);
		System.out.printf("O primeiro caractere de espaço está na posição %d%n", i);
		System.out.printf("A primeira palavra da frase é (%s)%n", frasePrimeiraPalavra);
		System.out.printf("Substring na posição %d: %s%n", i, fraseSubstringI);
		System.out.printf("A segunda palavra da frase é (%s)%n", fraseSegundaPalavra);
		teclado.close();
		System.out.println("Fim do programa!!!");

	}

}
