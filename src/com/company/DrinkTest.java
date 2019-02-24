package com.company;

import org.junit.jupiter.api.Test;

import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DrinkTest {
    PrintStream out = new PrintStream(System.out);

    /**
     * This test is used for determining if the method for calculating price works
     */
    @Test
    public void priceTest(){
        assertTrue(new Drink.Coffee().calculatePrice() == 2.75);
        assertTrue(new Drink.DecafCoffee().calculatePrice() == 2.75);
        assertTrue(new Drink.CaffeLatte().calculatePrice() == 2.55);
        assertTrue(new Drink.CaffeAmericano().calculatePrice() == 3.30);
        assertTrue(new Drink.CaffeMocha().calculatePrice() == 3.35);
        assertTrue(new Drink.Cappuccino().calculatePrice() == 2.90);
    }

    /**
     * This test is used for determining if the calculate price method works with polymorphism
     */
    @Test
    public void priceTestWithPolymorph(){
        Drink a = new Drink.Coffee();
        Drink b = new Drink.DecafCoffee();
        Drink c = new Drink.CaffeLatte();
        Drink d = new Drink.CaffeAmericano();
        Drink e = new Drink.CaffeMocha();
        Drink f = new Drink.Cappuccino();

        assertTrue(a.calculatePrice() == 2.75);
        assertTrue(b.calculatePrice() == 2.75);
        assertTrue(c.calculatePrice() == 2.55);
        assertTrue(d.calculatePrice() == 3.30);
        assertTrue(e.calculatePrice() == 3.35);
        assertTrue(f.calculatePrice() == 2.90);
    }

    /**
     * This test is used for determining if the names for the drink objects are correct
     */
    @Test
    public void nameTest(){
        Drink a = new Drink.Coffee();
        Drink b = new Drink.DecafCoffee();
        Drink c = new Drink.CaffeLatte();
        Drink d = new Drink.CaffeAmericano();
        Drink e = new Drink.CaffeMocha();
        Drink f = new Drink.Cappuccino();

        out.println(a.name);
        out.println(b.name);
        out.println(c.name);
        out.println(d.name);
        out.println(e.name);
        out.println(f.name);

        out.println("********************");
        out.println(a.returnName());
        out.println(b.returnName());
        out.println(c.returnName());
        out.println(d.returnName());
        out.println(e.returnName());
        out.println(f.returnName());

        assertTrue(a.name.equals("Coffee"));
        assertTrue(b.name.equals("Decaf Coffee"));
        assertTrue(c.name.equals("Caffe Latte"));
        assertTrue(d.name.equals("Caffe Americano"));
        assertTrue(e.name.equals("Caffe Mocha"));
        assertTrue(f.name.equals("Cappuccino"));

        assertTrue(a.returnName().equals("Coffee"));
        assertTrue(b.returnName().equals("Decaf Coffee"));
        assertTrue(c.returnName().equals("Caffe Latte"));
        assertTrue(d.returnName().equals("Caffe Americano"));
        assertTrue(e.returnName().equals("Caffe Mocha"));
        assertTrue(f.returnName().equals("Cappuccino"));



    }


}