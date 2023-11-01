import java.util.*;

public class Main {

	public static void main(String[] args) {
	byte idade = 28;
	double preco = 4.85;
	float nota = 8.5f;
	System.out.println("Bom dia!");
	System.out.println("Estou aprendendo Java. \nIdade = "+idade);
	System.out.println("O preço é R$"+preco);
	System.out.printf("A nota é %.1f%n", nota); //Com separador ","
	System.out.println("Idade: "+idade+" Preço: R$"+ preco + " Nota: "+ nota);
	System.out.printf("Idade: %d - Preço: R$%.2f - Nota: %.1f%n", idade, preco, nota);
	//Mudar a localidade
	Locale.setDefault(Locale.US);
	System.out.printf("Idade: %d - Preço: R$%.2f - Nota: %.1f%n", idade, preco, nota);
	System.out.printf("A nota é %.1f%n", nota); //Com separador "."
	System.out.println("Idade: "+idade+" Preço: R$"+ preco + " Nota: "+ nota);
	
	
			
	}

}
