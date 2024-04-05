package com.shopping.basket.enums;

import com.shopping.basket.models.Apple;
import com.shopping.basket.models.Lime;
import com.shopping.basket.models.Melon;
import com.shopping.basket.models.Product;

public enum Item {
	APPLE(new Apple()),
	MELON(new Melon()),

	LIME(new Lime());

	private final Product product;

	Item(Product product) {
		this.product = product;
	}

	public Product getProduct() {
		return product;
	}
}