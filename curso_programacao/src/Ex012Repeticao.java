import java.util.*;
public class Ex012Repeticao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pares = 0;
		for(int i = 1; i <= 10; i++) {
			int valor = sc.nextInt()%2;
			if(valor == 0) {
				pares++;
			}
		}
		System.out.printf("Digitou %d números pares.", pares);
		sc.close();
	}

}
