package funcoes;

import java.util.Scanner;

public class Mostrar_maior_numero {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Enter three numbers:");
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		int c = teclado.nextInt();
		
/* Sem usar funções 		
		if(a>b && a>c) {
			System.out.println("Higher = "+a);
		}else if (b>c){
			System.out.println("Higher = "+b);
		} else {
			System.out.println("Higher = "+c);
		}
*/	

		//Com uso de funções
		
		int higher = max(a, b, c);
		
		showResult(higher);
		
		
		System.out.println("Programa encerrado!");
		teclado.close();

	}
	
	
	public static int max(int x, int y, int z) {
		int auxiliar;
		if(x>y && x>z) {
			auxiliar = x;
		}else if (y>z){
			auxiliar = y;
		} else {
			auxiliar = z;
		}
		
		return auxiliar;
	}
	
	public static void showResult(int value) {
		System.out.printf("Higher = %d%n", value);
	}
	

}
