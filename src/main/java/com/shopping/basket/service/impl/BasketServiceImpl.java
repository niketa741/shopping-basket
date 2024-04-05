package com.shopping.basket.service.impl;

import com.shopping.basket.enums.Item;
import com.shopping.basket.models.Basket;
import com.shopping.basket.models.Product;
import com.shopping.basket.service.BasketService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class BasketServiceImpl implements BasketService {

    @Override
    public void addToBasket(Item pro, Basket basket) {
        Product product = pro.getProduct();
        if (basket.getMap().containsKey(product)) {
            int currentQuantity = basket.getMap().get(product);
            basket.getMap().put(product, currentQuantity + 1); // Increment the quantity
        } else {
            basket.getMap().put(product, 1);
        }
    }

    @Override
    public double calculatePrice(Basket basket) {
        double totalPrice = 0.0;
        for( Map.Entry<Product, Integer> mapValue : basket.getMap().entrySet()) {
            Product product = mapValue.getKey();
            totalPrice = totalPrice + getTotalPriceOfProduct(product,mapValue.getValue());
        }
        return totalPrice;
    }

    private double getTotalPriceOfProduct(Product product, Integer count) {

        int countByStrategy = count;
        switch (product.getPriceStrategy()) {
            case BUY_ONE_GET_ONE :
                countByStrategy = count/2 + count % 2;
                return product.getPrice() * countByStrategy;
            case THREE_FOR_THE_PRICE_OF_TWO:
                countByStrategy = (count/3)*2 + countByStrategy % 3;
                return product.getPrice() * countByStrategy;
        }
        return product.getPrice() * count;
    }

}
