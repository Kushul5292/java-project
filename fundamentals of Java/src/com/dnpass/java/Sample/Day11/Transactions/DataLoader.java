package com.dnpass.java.Sample.Day11.Transactions;
import java.util.*;
public class DataLoader {
	
	public static List<Transaction> newTransactions() {
		List<Transaction> Transactions = new ArrayList<Transaction>();
		Transactions.add(new Transaction(123,ProductType.FUEL,33.33,"LONDON","GBP"));
		Transactions.add(new Transaction(124,ProductType.ELECTRIC,100.0,"BANGALORE","INR"));
		Transactions.add(new Transaction(125,ProductType.GROCERIES,50.5,"CHENNAI","INR"));
		return Transactions;
	}
}
