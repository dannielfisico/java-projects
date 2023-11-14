package entities;

public class AccountLevel5 {
	private int number;
	private String client;
	private double balance;
	private String msg;
	
	public AccountLevel5(int number, String client, double initialDeposity) {
		this.number = number;
		this.client = client;
		deposity(initialDeposity);
		msg = "Conta criada com sucesso.";
	}
	
	public AccountLevel5(int number, String client) {
		this.number = number;
		this.client = client;
		msg = "Conta criada com sucesso.";
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
		if(amount <= 0) {
			msg = "Operação Abortada.";
		} else {
			msg = String.format("Depósito de $%.2f realizado", amount); 
			balance += amount;
			
		}
		
	}
	
	public void withdraw(double amount) {
		if (amount > balance) {
			msg = "Operação Abortada.";
		} else {
			msg = String.format("Saque de $%.2f realizado (Taxa de: $ 5.00)", amount); 
			balance -= amount + 5.00;
			
		}
	}

	public String toString() {
		return String.format("%nStatus: %s%nNúmero: %d%nCliente: %s%nSaldo: $%.2f",msg, number, client, balance );
	}
		
}
