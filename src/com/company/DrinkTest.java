package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DrinkTest {

    @Test
    public void priceTest(){
        assertTrue(new Drink.Coffee().calculatePrice() == 2.75);
        assertTrue(new Drink.DecafCoffee().calculatePrice() == 2.75);
        assertTrue(new Drink.CaffeLatte().calculatePrice() == 2.55);
        assertTrue(new Drink.CaffeAmericano().calculatePrice() == 3.30);
        assertTrue(new Drink.CaffeMocha().calculatePrice() == 3.35);
        assertTrue(new Drink.Cappuccino().calculatePrice() == 2.90);
    }

}