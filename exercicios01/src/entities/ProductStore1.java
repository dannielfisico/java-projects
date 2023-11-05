package entities;

public class ProductStore1 {
	private int id;
	private String name;
	private double price;
	
	
	public ProductStore1(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double precoMedio(double sum, int quantity) {
		return sum/quantity;
	}
	
	public String toString() {
		return String.format("Prod_id: $d\t - Prod_nome: %s\t, Prod_preço: $ %.2f\t%n", id,name, price );
	}

}
