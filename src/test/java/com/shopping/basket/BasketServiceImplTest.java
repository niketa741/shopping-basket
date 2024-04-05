package com.shopping.basket;

import java.util.Arrays;
import java.util.List;

public class BasketServiceImplTest {
}

//public class Shopping {
//
//    public static void main(String[] a) {
//
//        Basket basket = new Basket();
//        List<String> productList = Arrays.asList("Apple","Apple","Apple","Melon","Lime","Apple",
//                "Apple","Melon","Melon","Melon","Melon");
//        for (String product : productList) {
//            basket.addToBasket(Pro.valueOf(product.toUpperCase()));
//        }
//        System.out.println("Total cost of Basket : "+basket.calculatePrice());
//
//    }
//
//}
//
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import static org.mockito.Mockito.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//class YourControllerTest {
//
//    @InjectMocks
//    private YourController yourController;
//
//    @Mock
//    private BasketService basketService;
//
//    @Test
//    void testCalculateBasketValue() {
//        // Arrange
//        List<String> productList = new ArrayList<>();
//        productList.add("ITEM_A");
//        productList.add("ITEM_B");
//
//        Basket basket = new Basket();
//        when(basketService.calculatePrice(basket)).thenReturn(50.0); // Mocking the basket service method
//
//        // Act
//        double result = yourController.calculateBasketValue(productList);
//
//        // Assert
//        assertEquals(50.0, result); // Asserting the expected total price
//        verify(basketService, times(2)).addToBasket(any(), eq(basket)); // Verifying the addToBasket method called twice with any Item and basket
//        verify(basketService, times(1)).calculatePrice(basket); // Verifying the calculatePrice method called once with basket
//    }
//}
