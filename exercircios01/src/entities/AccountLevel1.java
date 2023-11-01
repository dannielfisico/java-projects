package entities;

public class AccountLevel1 {
	private int number;
	private String client;
	private double balance;
	private String msg = "";
	
	//Construtor completo com todos os campos
	public AccountLevel1(int number, String client, double initialDeposit) {
		this.number = number;
		this.client = client;
		deposit(initialDeposit);
	}
	
	//Construtor com número da conta e nome do cliente
	public AccountLevel1(int number, String client) {
		this.number = number;
		this.client = client;
	}
	
	//Construtor exclusivo para gerar mensagens de aviso
	public AccountLevel1(String msg) {
		this.msg = msg;
	}

	//Metodos get e set
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
	
	public String getMsg() {
		return msg;
	}
	//Fim dos métodos get e set
	
	//Criação dos métodos da conta: Depósito e Saque
	
	public void deposit(double amount) {
		balance += amount;
		msg = String.format("Depósito no valor de R$ %.2f realizado com sucesso.", amount);
	}
	
	public void withdraw(double amount) {
		if(amount <= balance) {
			balance -= amount + 5.00;
			msg = String.format("Saque de R$ %.2f realizado com sucesso.", amount);
		} else {
			msg = "Saldo insuficiente";
		}
	}
	
	public String toString() {
		return String.format("%s%nDados da conta:%n"
				+ "Número da conta: %d | Cliente: %s | Saldo: R$ %.2f", getMsg(),number, client, balance );
	}

}
