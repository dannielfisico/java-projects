/*2. Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
números 4, 5 e 6. A soma das duas médias. A média das médias.*/


public class Ex002 {

	public static void main(String[] args) {
		double nota1 = 8.9;
		double nota2 = 7;
		double media1 = (nota1 + nota2)/2;
		System.out.printf("A média entre %.1f e %.1f é %.2f.%n", nota1, nota2, media1);
		double nota3 = 4.5;
		double nota4 = 6;
		double media2 = (nota3 + nota4)/2;
		System.out.printf("A média entre %.1f e %.1f é %.2f.%n", nota3, nota4, media2);
		double media3 = (media1 + media2)/2;
		System.out.printf("A média entre %.2f e %.2f é %.2f", media1, media2, media3);
	}

}
