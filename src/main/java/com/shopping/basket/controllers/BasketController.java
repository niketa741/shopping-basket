package com.shopping.basket.controllers;

import com.shopping.basket.enums.Item;
import com.shopping.basket.models.Basket;
import com.shopping.basket.service.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/basket")
public class BasketController {

    @Autowired
    BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @PostMapping
    public double calculateBasketValue(@RequestBody List<String> productList) {

        Basket basket = new Basket();
        for (String product : productList) {
            basketService.addToBasket(Item.valueOf(product.toUpperCase()),basket);
        }
        return basketService.calculatePrice(basket);
    }


}
