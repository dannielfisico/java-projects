import java.util.*;
public class Ex009Repeticao2 {

	public static void main(String[] args) {
		int idadeMenor = Integer.MAX_VALUE; //importante
		String nomeMenor = "";
		
		Scanner teclado = new Scanner(System.in);
		
		for(int i = 1; i <=5; i++) {
			System.out.printf("Nome%d:%n", i);
			String nome = teclado.nextLine();
			System.out.printf("Idade de %s:%n", nome);
			int idade = teclado.nextInt();
			teclado.nextLine(); //importante
			if(idade < idadeMenor) {
				idadeMenor = idade;
				nomeMenor = nome;				
			}
			
		}
		System.out.printf("%s é a pessoa mais nova com %d anos.", nomeMenor, idadeMenor);
		teclado.close();
	}

}
