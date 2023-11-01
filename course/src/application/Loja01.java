package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Loja01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
				
		System.out.println("Entre com os dados do produto:");
		System.out.print("Nome: ");
		produto.nome = sc.nextLine();
		System.out.print("Preço: ");
		produto.preco = sc.nextDouble();
		System.out.print("Quantidade no estoque: ");
		produto.quantidade = sc.nextInt();
		System.out.println();
		
		
		
		//System.out.printf("%s R$%.2f %d und", produto.nome, produto.preco, produto.quantidade);
		System.out.printf("Dados do produto: %s",produto);
		System.out.println();
		System.out.printf("Informe a quantidade de %s para ser adicionada no estoque: ", produto.nome);
		int quantidade = sc.nextInt();
		produto.adicionarProdutos(quantidade);
		System.out.printf("Dados Atualizados: %s", produto);
		System.out.println();
		System.out.printf("Informe a quantidade de %ss para ser retirada no estoque: ", produto.nome);
		System.out.println();
		quantidade = sc.nextInt();
		produto.removerProdutos(quantidade);
		System.out.printf("Dados Atualizados: %s", produto);
		
		
		sc.close();

	}

}
