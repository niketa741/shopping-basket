package com.shopping.basket.models;

import com.shopping.basket.enums.PriceStrategy;

public class Apple extends Product {

	public Apple() {

	}
	String name = "Apple";
	double price = 12.0;
	PriceStrategy priceStrategy = PriceStrategy.BUY_ONE_GET_ONE;

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