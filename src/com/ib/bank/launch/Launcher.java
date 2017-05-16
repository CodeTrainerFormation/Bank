package com.ib.bank.launch;

import com.ib.bank.entities.Account;
import com.ib.bank.entities.Basket;
import com.ib.bank.entities.Person;
import com.ib.bank.entities.Product;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account();
		acc.credit(100);
		acc.viewBalance();
		acc.debit(70);
		acc.viewBalance();
		
		Person john = new Person("John", "DOE");
		john.openAccount();
		john.getAccount().viewBalance();
		
		Basket panier = new Basket();
		john.setBasket(panier);
		
		Product milk = new Product("Lait", 1);
		john.getBasket().addToBasket(milk);
		john.getBasket().displayBasket();
		
		john.payBasket();
		john.getAccount().viewBalance();
	}

}
