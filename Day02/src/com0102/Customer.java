package com0102;

public class Customer extends Person {
	private int customerId;
	private double accountNumber;
	private double balance;

	public Customer(String name, String gender, int customerId, double accountNumber, double balance) {
		super(name, gender);
		this.customerId = customerId;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public double getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(double accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public void display() {
		System.out.println("Customer Display.. CustomerId " + customerId + " accountNumber "+accountNumber + " balance " + balance + " Name " + getName() + " Gender " + getGender());
	}

}
