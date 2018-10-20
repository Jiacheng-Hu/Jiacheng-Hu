package com.assignment5;

public class Cookie extends DessertItem {
	private double number;
	private int pricePerDozen;

	public Cookie(String name, double number, int pricePerDozen) {
		super(name);
		this.number = number;
		this.pricePerDozen = pricePerDozen;
	}

	@Override

	public int getCost() {
		return (int) ((float) (this.number / 12) * this.pricePerDozen + 0.5);
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(
				number + " @ " + DessertShoppe.cents2dollarsAndCentsmethod(pricePerDozen) + " /dz." + "\n" + getName());
		String price = DessertShoppe.cents2dollarsAndCentsmethod(this.getCost());
		for (int i = 0; i < DessertShoppe.width - getName().length() - price.length(); i++) {
			stringBuilder.append(" ");
		}
		stringBuilder.append(price);
		return stringBuilder.toString();
	}
}
