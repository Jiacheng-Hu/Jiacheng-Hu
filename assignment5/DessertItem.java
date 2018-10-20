package com.assignment5;

public abstract class DessertItem {
	protected String name;

	public DessertItem(String name) {
		if (name.length() <= DessertShoppe.maximumsize) {
			this.name = name;
		} else {
			this.name = name.substring(0, DessertShoppe.maximumsize + 1);
		}
	}

	public final String getName() {
		return this.name;
	}

	public abstract int getCost();
}
