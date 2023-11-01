import java.util.*;
public class Ex009Repeticao {  

	public static void main(String[] args) {
		
		int idadeMaisNova = Integer.MAX_VALUE;
		String nomeMaisNovo = "";
		
		int idadeMaisVelha= 0;
		String nomeMaisVelha = "";
				
		Scanner osk = new Scanner(System.in);
			for(int i = 1; i<=5;i++) {
				System.out.printf("Nome: %d%n", i);
				String nome = osk.nextLine();
				System.out.printf("Idade de %s%n", nome);
				int idade = osk.nextInt();
				osk.nextLine();
				if(idade < idadeMaisNova) {
					idadeMaisNova = idade;
					nomeMaisNovo = nome;
				} else {
					idadeMaisVelha = idade;
					nomeMaisVelha = nome;
				}
			}
				
		osk.close();
		System.out.printf("Pessoa mais nova é %s que tem %d anos.%n", nomeMaisNovo, idadeMaisNova);
		System.out.printf("Pessoa mais velha é %s que tem %d anos.%n", nomeMaisVelha, idadeMaisVelha);
		System.out.println("Fim do programa!!");
			
	}

}
