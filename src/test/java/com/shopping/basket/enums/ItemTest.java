package com.shopping.basket.enums;

import com.shopping.basket.models.Apple;
import com.shopping.basket.models.Lime;
import com.shopping.basket.models.Melon;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ItemTest {

    @Test
    void getProduct() {
        // Test getProduct method for each enum constant
        Assertions.assertEquals(Apple.class, Item.APPLE.getProduct().getClass());
        Assertions.assertEquals(Melon.class, Item.MELON.getProduct().getClass());
        Assertions.assertEquals(Lime.class, Item.LIME.getProduct().getClass());
    }
}