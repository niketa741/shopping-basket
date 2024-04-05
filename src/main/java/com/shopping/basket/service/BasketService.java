package com.shopping.basket.service;

import com.shopping.basket.enums.Item;
import com.shopping.basket.models.Basket;
import com.shopping.basket.models.Product;
import org.springframework.stereotype.Service;

@Service
public interface BasketService {


    void addToBasket(Item pro, Basket basket);

    double calculatePrice(Basket basket);

}
