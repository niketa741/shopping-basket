package com.shopping.basket.enums;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PriceStrategyTest {

    @Test
    void enumValues() {
        // Test enum values
        Assertions.assertEquals(PriceStrategy.BUY_ONE_GET_ONE, PriceStrategy.valueOf("BUY_ONE_GET_ONE"));
        Assertions.assertEquals(PriceStrategy.THREE_FOR_THE_PRICE_OF_TWO, PriceStrategy.valueOf("THREE_FOR_THE_PRICE_OF_TWO"));
        Assertions.assertEquals(PriceStrategy.DEFAULT, PriceStrategy.valueOf("DEFAULT"));
    }
}