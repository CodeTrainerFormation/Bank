package com.ib.bank.entities;

import com.ib.bank.interfaces.IAccount;

public abstract class Person {
	
	private String firstname;
	private String lastname;
	private int age;
	private String city;
	private IAccount account;
	private Basket basket;
	
	public Person(String fname, String lname) {
		this.firstname = fname;
		this.lastname = lname;
	}
	
	public void openAccount() {
		//this.account = new Account();
		
		IAccount a = new Account();
		this.account = a;
	}
	
	public void payBasket() {
		int totalBill = this.basket.getBill();
		if(this.account.canDebit(totalBill)) {
			this.account.debit(totalBill);
		}
	}

	public IAccount getAccount() {
		return account;
	}

	public void setAccount(IAccount account) {
		this.account = account;
	}

	public Basket getBasket() {
		return basket;
	}

	public void setBasket(Basket basket) {
		this.basket = basket;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.firstname + " " + this.lastname;
	}
	
}
