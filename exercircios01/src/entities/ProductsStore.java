package entities;

public class ProductsStore {
	private int key = 1;
	private String name;
	private double price;
	
	
	public ProductsStore(int key,String name, double price) {
		this.key = key;
		this.name = name;
		this.price = price;
		
	}
	
	public int getKey() {
		return key;
	}
	
	public void setKey(int key) {
	 	this.key = key;
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
	
	public String toString() {
		return String.format("%d - %s |R$ %.2f",key +1 , name, price );
		
	}
}
