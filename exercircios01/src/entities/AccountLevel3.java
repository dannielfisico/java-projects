package entities;

public class AccountLevel3 {
	private int number;
	private String client;
	private double balance;
	private String msg;
	
	
	//Construtores
public AccountLevel3(int number, String client, double initialDeposit) {
	this.number = number;
	this.client = client;
	deposit(initialDeposit);
	msg = getMsg();
		
	}
	
public AccountLevel3(int number, String client) {
	this.number = number;
	this.client = client;
	msg = "Conta criada com sucesso";
}
	
	
	//Métodos Getters e Setters 
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
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	//Métodos de depósito e Saque com regras de negócio
	

	public void deposit(double amount){
		//Regra de negócio (Se o valor do depósito for menor ou igual a 0 (zero) o depósito será abortado)
		if (amount > 0) {
			balance += amount;
			msg = String.format("%nDados atualizados%nDepósito de R$ %.2f realizado com sucesso.%n", amount);
			
		} else {
			setMsg(String.format("%nImpossível depositar valor negativo%n"));
		}
		
	}
	
	public void withdraw(double amount) {
		//Regra de negócio (Taxa de $ 5.00 ao realizar cada saque)
		if(balance > 0) {
			if (amount > balance) {
				setMsg(String.format("%nSaldo insuficiente%n"));
			} else if(amount < 0) {
				setMsg(String.format("%nNão aceitamos saque negativos%n"));
				
			}else {
				balance -= amount + 5.00;
				setMsg(String.format("%nDados atualizados%nSaque de %.2f realizado com sucesso.", amount));
			}
			
		} else {
			setMsg(String.format("%s, seu saldo é insuficiente para saque.", client));
			
		}
	}
	
	public String toString() {
		return String.format("%s%nDados da conta:%nNúmero da Conta: %d%nTitular: %s%nSaldo: R$ %.2f%n",msg, number, client, balance);
	}

}
