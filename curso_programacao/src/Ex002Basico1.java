
public class Ex002Basico1 {

	public static void main(String[] args) {
		double nota1 = 8.9d;
		double nota2 = 7.0d;
		double media1 = (nota1 + nota2)/2;
		double nota3 = 4.5d;
		double nota4 = 6.0d;
		double media2 = (nota3 + nota4)/2;
		double media3 = (media1 + media2)/2;
		
		System.out.printf("A média entre Nota1: %.2f e Nota2: %.2f é Média: %.2f%n",nota1, nota2, media1);;
		System.out.printf("A média entre Média1 e Média2 é %.2f", media3);
	}

}
