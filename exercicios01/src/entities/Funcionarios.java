package entities;

public class Funcionarios {
	private int key;
	private String name;
	private double salary;
	
	public Funcionarios(int key, String name, double salary) {
		
		this.key = key;
		this.name = name;
		this.salary = salary;
	}
	
	public int getKey() {
		return key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}
	
	public void increaseSalary(double percent) {
			salary += salary * (percent/100);			
	}
	
		
	public String toString() {
		return String.format("\t%d,\t%s,\t$ %.2f", getKey(), getName(),getSalary());
	}

}
