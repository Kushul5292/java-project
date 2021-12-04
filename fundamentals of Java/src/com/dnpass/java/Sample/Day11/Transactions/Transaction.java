package com.dnpass.java.Sample.Day11.Transactions;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

//import javax.xml.bind.annotation.xmlRootElement;
//import javax.xml.*;

	
class CityComparator  implements Comparator<Transaction>{
	
	@Override
	public int compare(Transaction t1, Transaction t2) {
		// TODO Auto-generated method stub

		return t1.city.compareTo(t2.city);
	}
}
class AmountComparator  implements Comparator<Transaction>{
		
		@Override
		public int compare(Transaction t1, Transaction t2) {
			// TODO Auto-generated method stub

			if(t1.amount==t2.amount)  
				return 0;  
				else if(t1.amount>t2.amount)  
				return 1;  
				else  
				return -1;  
				}
		}
		
public class Transaction  implements Serializable,Cloneable,Comparable<Transaction>{
	protected Integer id;
	protected ProductType type;
	protected Double amount;
	protected String city;
	protected String currency;
	
	
	public Transaction() {
		super();
	}
	
	public Transaction(Integer id, ProductType type, Double amount, String city, String currency) {
		//super();
		this.id = id;
		this.type = type;
		this.amount = amount;
		this.city = city;
		this.currency = currency;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ProductType getType() {
		return type;
	}

	public void setType(ProductType type) {
		this.type = type;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
	public int compareTo(Transaction o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
