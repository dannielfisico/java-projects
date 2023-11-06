package entities;

public class ProdutosMedia {
	private String name;
	private double price;
	
	public ProdutosMedia(String name, double price) {
		this.name =  name;
		this.price = price;
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
	
	public double average(double sum, int quantity) {
		return sum/quantity;
	}
	

}
