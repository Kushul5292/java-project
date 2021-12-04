package com.dnpass.java.Sample.Day8.Account;
public class PrivelegedAccount extends Account {
	public void withdraw(double Amount) {
		super.setAccountBalance(super.getAccountBalance()-Amount);
	}

}

