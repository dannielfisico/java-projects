import java.util.*;

public class EntradaDados {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("####### Programa - Calculando área #######");
		System.out.printf("Digite 1 para quadrado e 2 para trapézio%n");
		String poligono = teclado.next();
		switch (poligono) {
		case "1":
			System.out.println("Parâmentro 1: Quadrado");
			System.out.println("Medida do Lado1:");
			double lado1 = teclado.nextDouble();
			System.out.println("Medida do Lado2:");
			double lado2 = teclado.nextDouble();
			double area = lado1 * lado2;
			System.out.printf("Área Quarado: %.2f m²", area);
			break;
		case "2":
			System.out.println("Parâmentro 2: Trapézio");
			System.out.println("Medida da Base1:");
			double base1 = teclado.nextDouble();
			System.out.println("Medida da Base2:");
			double base2 = teclado.nextDouble();
			System.out.println("Medida da Altura:");
			double altura = teclado.nextDouble();
			double area2 = ((base1 + base2) * altura) / 2;
			System.out.printf("Área Trapézio: %.2f m²", area2);
			break;
		default:
			System.out.println("Parâmentro incorreto.");
		}
		teclado.close();
	}

}
