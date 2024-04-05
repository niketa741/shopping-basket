package com.shopping.basket.models;

import com.shopping.basket.enums.PriceStrategy;

public class Product {

	String name;
	double price;

	PriceStrategy priceStrategy;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public PriceStrategy getPriceStrategy() {
		return priceStrategy;
	}

	public void setPriceStrategy(PriceStrategy priceStrategy) {
		this.priceStrategy = priceStrategy;
	}
}