package com.ib.bank.entities;

import com.ib.bank.interfaces.IAccount;

public class Account implements IAccount {

	private int balance;
	private int id;
	private static int count = 0;
	
	public Account() {
		this.id = ++count;
		this.balance = 50;
	}
	
	public void credit(int amount) {
		// this.balance = this.balance + amount;
		this.balance += amount;
	}
	
	public void debit(int amount) {
		this.balance -= amount;
	}
	
	@Override
	public void viewBalance() {
		// TODO Auto-generated method stub
		System.out.println("Solde : " + this.balance);
	}
	
	public boolean canDebit(int amount) {
//		if(this.balance - amount >= 0) {
//			return true;
//		}
//		return false;
		
		return this.balance >= amount;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	
	
}
