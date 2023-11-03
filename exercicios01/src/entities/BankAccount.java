package entities;

public class BankAccount {
	private int accountNumber;
	private String holder;
	private double balance;
	private String msg;
	
	public BankAccount(int accountNumber, String holder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.holder = holder;
		deposit(initialDeposit);
		msg = "Conta criada com sucesso";
	}
	
	public BankAccount(int accountNumber, String holder) {
		this.accountNumber = accountNumber;
		this.holder = holder;
		msg = "Your account was criated susseful";
	}
	
	public BankAccount(String msg) {
		this.msg = msg;
	}
	
	public void deposit(double amount) {
		
		if(amount > 0) {
			balance+= amount;
			msg = String.format("Depósito de $ %.2f realizado com sucesso.", amount);
		} else {
			msg = String.format("Depósito não realizado");
		}
	}
	
	public void withdraw(double amount) {
		if(amount <= balance) {
			balance-= amount + 5.00;
			msg = String.format("Saque de $ %.2f realizado com sucesso.", amount);
		} else {
			msg = "Operação não foi realizada. Saldo insuficiente.";
		}
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	
	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public String toString()  {
		return String.format("%n%s%nAccount %d, Holder: %s, Balance: $ %.2f", getMsg(), accountNumber, holder, balance);
	}

}
