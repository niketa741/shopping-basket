package com.shopping.basket.models;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    Map<Product,Integer> map = new HashMap<>();
    public Map<Product, Integer> getMap() {
        return map;
    }

    public void setMap(Map<Product, Integer> map) {
        this.map = map;
    }
}
