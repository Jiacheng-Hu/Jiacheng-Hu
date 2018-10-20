package com.assignment5;

public class Candy extends DessertItem {
	private double weight;
	private int pricePerPound;

	public Candy(String name, double weight, int pricePerPound) {
		super(name);
		this.weight = weight;
		this.pricePerPound = pricePerPound;
	}

	@Override
	public int getCost() {
		return (int) (this.weight * this.pricePerPound + 0.5);
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(weight + " lbs.@ " + DessertShoppe.cents2dollarsAndCentsmethod(pricePerPound) + " /lb."
				+ "\n" + getName());
		String price = DessertShoppe.cents2dollarsAndCentsmethod(this.getCost());
		for (int i = 0; i < DessertShoppe.width - getName().length() - price.length(); i++) {
			stringBuilder.append(" ");
		}
		stringBuilder.append(price);
		return stringBuilder.toString();
	}
}
