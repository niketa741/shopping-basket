package com.shopping.basket.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import com.shopping.basket.service.BasketService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BasketControllerTest {

    private BasketService basketService;
    private BasketController basketController;

    @BeforeEach
    public void setUp() {
        basketService = mock(BasketService.class);
        basketController = new BasketController(basketService);
    }

    @Test
    public void testCalculateBasketValueWithEmptyProductList() {
        List<String> emptyList = Arrays.asList();
        double expected = 0.0;
        double actual = basketController.calculateBasketValue(emptyList);
        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testCalculateBasketValueWithNonEmptyProductList() {
        List<String> productList = Arrays.asList("Apple","Apple","Apple","Melon","Lime","Apple",
                "Apple","Melon","Melon","Melon","Melon");
        double expected = 50.0; // Assuming total price is 50.0
        when(basketService.calculatePrice(any())).thenReturn(50.0);
        double actual = basketController.calculateBasketValue(productList);
        assertEquals(expected, actual, 0.0);
    }

}
