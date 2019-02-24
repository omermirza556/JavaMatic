package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IngredientTest {

    @Test
    public void test() {
        /*
        I just wanted to make sure that the test suite was working correctly
         */
        assertTrue(true);
    }

    /**
     * For this test I wanted to test whether the correct price is displayed for each of the ingredients
     * NOTE: I am not using polymorphism for this test
     */
    @Test
    public void ClassPriceTestWithoutPolymorph() {
        Ingredient.Coffee theCoffee = new Ingredient.Coffee();
        assertTrue(theCoffee.PRICE == 0.75);

        assertTrue((new Ingredient.Coffee()).PRICE == 0.75);

        assertTrue(new Ingredient.DecafCoffee().PRICE == 0.75);

        assertTrue(new Ingredient.Sugar().PRICE == 0.25);

        assertTrue(new Ingredient.Cream().PRICE == 0.25);

        assertTrue(new Ingredient.SteamedMilk().PRICE == 0.35);

        assertTrue(new Ingredient.FoamedMilk().PRICE == 0.35);

        assertTrue(new Ingredient.Espresso().PRICE == 1.10);

        assertTrue(new Ingredient.Cocoa().PRICE == 0.90);

        assertTrue(new Ingredient.WhippedCream().PRICE == 1.00);

    }

    /*
    This is to test the correct price appearing with subclassing
     */
    @Test
    public void PriceTestWithPolymorph() {
        /*

         */
        Ingredient a = new Ingredient.Coffee();
        Ingredient b = new Ingredient.DecafCoffee();
        Ingredient c = new Ingredient.Sugar();
        Ingredient d = new Ingredient.Cream();
        Ingredient e = new Ingredient.SteamedMilk();
        Ingredient f = new Ingredient.FoamedMilk();
        Ingredient g = new Ingredient.Espresso();
        Ingredient h = new Ingredient.Cocoa();
        Ingredient i = new Ingredient.WhippedCream();

        System.out.println(a.returnPrice());
        /*
        This is used to illustrate the concept of polymorphism, as we can see when you simply attempt to call
        the price value you will get the inherent price of the superclass
         */
        assertFalse(a.PRICE == 0.75);

        /*
        when a method is called however the price will appear as what it is supposed to be
         */
        assertTrue(a.returnPrice() == 0.75);
        assertTrue(b.returnPrice() == 0.75);
        assertTrue(c.returnPrice() == 0.25);
        assertTrue(d.returnPrice() == 0.25);
        assertTrue(e.returnPrice() == 0.35);
        assertTrue(f.returnPrice() == 0.35);
        assertTrue(g.returnPrice() == 1.10);
        assertTrue(h.returnPrice() == 0.90);
        assertTrue(i.returnPrice() == 1.00);

        //assertTrue(a.PRICE == 0.75);


    }


}