package com.dnpass.java.Sample.Day8.Account;
public class SavingsAccount extends Account {
	private double interestRate;
	
	public SavingsAccount(int accountNumber ,double accountBalance, double interestRate) {
		super(accountNumber,accountBalance);
		this.interestRate=interestRate;
	}
	
	public void addInterest() {
		double interest= getAccountBalance()*interestRate/100;
		super.deposit(interest);
	}

}
