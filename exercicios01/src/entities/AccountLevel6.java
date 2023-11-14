package entities;

import exceptions.BussinessExceptionsAccountL6;

public class AccountLevel6 {
	private Integer number;
	private String holder;
	private double balance;
	private Double withdrawLimit;
	
	public AccountLevel6() {
	}
	
	public AccountLevel6(Integer number, String holder, double initialDeposit, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
		this.withdrawLimit = withdrawLimit;
		
	}
	
	public Integer getNumber() {
		return number;
	}
	
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public Double getBalance() {
		return balance;
	}
	
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	
	public Double setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
		return withdrawLimit;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(Double amount) {
		validadeWithdraw(amount);
		balance -= amount;
	}
	
	public void validadeWithdraw(Double amount) {
		if(amount > getWithdrawLimit()) {
			throw new BussinessExceptionsAccountL6("Erro de saque: A quantia excede o Limite de Saque que é: "+ getWithdrawLimit());
		}
		if (amount > getBalance()) {
			throw new BussinessExceptionsAccountL6("Erro de saque: Saldo Insuficiente "+ getBalance());
		}
	}

}
