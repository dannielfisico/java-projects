package entidades;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;

	public double valorTotalEstoque() {
		return preco * quantidade;
	}

	public void adicionarProdutos(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}

	public String toString() {
		// return nome + ", R$ " + preco + ", "+ quantidade + " (und), Total em estoque
		// R$ "+ valorTotalEstoque();
		return nome + ", R$ " + String.format("%.2f", preco) + ", " + quantidade + " (und), Total em estoque R$ "
				+ String.format("%.2f", valorTotalEstoque());
	}

}
