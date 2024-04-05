package com.shopping.basket.models;

import com.shopping.basket.enums.PriceStrategy;

public class Lime extends Product {

	public Lime() {

	}
	String name = "Lemon";
	double price = 10.0;

	PriceStrategy priceStrategy = PriceStrategy.DEFAULT;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public PriceStrategy getPriceStrategy() {
		return priceStrategy;
	}

	@Override
	public void setPriceStrategy(PriceStrategy priceStrategy) {
		this.priceStrategy = priceStrategy;
	}
}
