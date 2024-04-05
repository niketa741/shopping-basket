package com.shopping.basket.models;

import com.shopping.basket.enums.PriceStrategy;

public class Melon extends Product {

	public Melon() {

	}
	String name = "Melon";
	double price = 15.0;

	PriceStrategy priceStrategy = PriceStrategy.THREE_FOR_THE_PRICE_OF_TWO;

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