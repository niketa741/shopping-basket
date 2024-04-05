package com.shopping.basket.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.shopping.basket.enums.Item;
import com.shopping.basket.models.Apple;
import com.shopping.basket.models.Basket;
import com.shopping.basket.models.Product;
import com.shopping.basket.service.impl.BasketServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BasketServiceImplTest {

    private BasketServiceImpl basketService;

    @BeforeEach
    public void setUp() {
        basketService = new BasketServiceImpl();
    }

    @Test
    public void testAddToBasket() {
        Basket basket = new Basket();
        Item item = Item.APPLE;
        Product product = item.getProduct();
        basketService.addToBasket(item, basket);
        Map<Product, Integer> expectedMap = new HashMap<>();
        expectedMap.put(product, 1);
        assertEquals(expectedMap, basket.getMap());
    }

    @Test
    public void testCalculatePrice() {
        Basket basket = new Basket();
        List<String> productList = Arrays.asList("Apple","Apple","Apple","Melon","Lime","Apple",
                "Apple","Melon","Melon","Melon","Melon");
        for(String product : productList) {
            basketService.addToBasket(Item.valueOf(product.toUpperCase()), basket);
        }
        double expectedTotalPrice = 106.0;
        double actualTotalPrice = basketService.calculatePrice(basket);
        assertEquals(expectedTotalPrice, actualTotalPrice, 0.0);
    }

    // Add more test cases for different scenarios as needed
}
