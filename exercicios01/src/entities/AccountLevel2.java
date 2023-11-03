package entities;

public class AccountLevel2 {
	private int number;
	private String client;
	private double balance;
	private String msg;
	
	public AccountLevel2(int number, String client, double initialDeposit) {
		this.number = number;
		this.client = client;
		deposit(initialDeposit);
		setMsg("Sucesso!!");
	}
	
	public AccountLevel2(int number, String client) {
		this.number = number;
		this.client = client;
		
	}
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
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
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		if(amount <= balance && balance > 0) {
			balance -= amount + 5.00;
			setMsg(String.format("Saque de R$ %.2f realizado com sucesso.", getBalance()));
		} else {
			setMsg(String.format("Saldo insuficiente."));
			
		}
	}

	@Override
	public String toString() {
		return String.format("%s%nNúmero: %d%n"
				+ "Titular: %s%n"
				+ "Saldo: R$ %.2f",msg, number, client, balance);
	}
	
}
