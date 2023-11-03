package entities;

public class AccountLevel4 {
	private int number;
	private String client;
	private double balance;
	private String msg;
	
	public AccountLevel4(int number, String client, double initialDeposity) {
		this.number = number;
		this.client = client;
		deposity(initialDeposity);
	}
	
	public AccountLevel4(int number, String client) {
		this.number = number;
		this.client = client;

	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getClient() {
		return client;
	}
	
	public void setClient(String client) {
		this.client = client;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposity(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount - 5.00;
	}

	public String toString() {
		return String.format("%nNumber: %d%nClient: %s%nBalance: $%.2f",number, client, balance );
	}
		
}
