package com.ib.bank.interfaces;

public interface IAccount {

	void credit(int amount);
	void debit(int amount);
	void viewBalance();
	boolean canDebit(int amount);
	
}
