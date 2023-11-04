package entities;

public class Pessoa {
	private String name;
	private int age;
	private double heigth;
	
	
	public Pessoa(String name, int age, double heigth) {
		this.name = name;
		this.age = age;
		this.heigth = heigth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeigth() {
		return heigth;
	}

	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}
	
	public boolean lessThan(int age) {
		if(age < 16) {
			return true;
		}
		
		return false;
	}
	
	public double percent(int lessThan16, int quantity) {
		double percent = lessThan16/quantity;
		return percent*100;
	}
	
	public double average(double sum, int quantity) {
		double average = sum/quantity;
		return average;
	}
	
	@Override
	public String toString() {
		return "Pessoa [name=" + name + ", age=" + age + ", heigth=" + heigth + "]";
	}
	
	

}
