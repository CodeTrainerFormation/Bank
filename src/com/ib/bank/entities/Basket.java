package com.ib.bank.entities;

import java.util.ArrayList;
import java.util.Iterator;

public class Basket {
	
	private ArrayList<Product> products;
	private int bill;
	
	public Basket() {
		this.setBill(0);
		this.products = new ArrayList<>();
	}
	
	public void addToBasket(Product p) {
		this.products.add(p);
		this.calcTotalBasket();
	}
	
	public void removeToBasket(int index) {
		this.products.remove(index);
		this.calcTotalBasket();
	}
	
	public void displayBasket() {
		Iterator<Product> itProd = this.products.iterator();
		
		while(itProd.hasNext()) {
			Product p = itProd.next();
			System.out.println("Nom : " + p.getName());
		}
	}
	
	public void calcTotalBasket() {
		this.setBill(0);
		for(Product p : this.products) {
			this.setBill(this.getBill() + p.getPrice());
		}
	}

	public int getBill() {
		return bill;
	}

	public void setBill(int bill) {
		this.bill = bill;
	}
}
