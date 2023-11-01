package operadores_entrada_saida;

public class Escopo_variaveis {

	public static void main(String[] args) {
		double desconto = Integer.MAX_VALUE;
		double price = 50;
		
		if(price <200) {
			desconto = price * 0.1;
		}

		System.out.println(desconto);
	}

}
