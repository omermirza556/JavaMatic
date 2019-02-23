package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {

        }
    }
}

/**
 * This abstract class will be the super class for the following drinks
 * This class will contain a method to calculate the price based on the ingredients in the drink
 */
abstract class Drink {
    ArrayList<Ingredient> drinkIngredient = new ArrayList<>();
    String name = "";

    public Drink() {

    }

    /**
     * This method will be used to dynamically calculate the price of the drink
     *
     * @return the price of the beverage
     */
    public double CalculatePrice() {
        double price = 0;
        if (drinkIngredient != null && !drinkIngredient.isEmpty()) {

            for (int i = 0; i < drinkIngredient.size(); i++) {
                price += drinkIngredient.get(i).returnPrice();
            }

        }

        return price;
    }

    public String returnName(){
        return name;
    }

    public class Coffee extends Drink {
        public Coffee() {
            for(int i = 0; i<3; i++){
                drinkIngredient.add(new Ingredient.Coffee());
            }
            drinkIngredient.add(new Ingredient.Sugar());
            drinkIngredient.add(new Ingredient.Cream());
            this.name = "Coffee";

        }
    }

    public class DecafCoffee extends Drink {
        public DecafCoffee() {
            for(int i = 0; i<3; i++){
                drinkIngredient.add(new Ingredient.DecafCoffee());
            }
            drinkIngredient.add(new Ingredient.Sugar());
            drinkIngredient.add(new Ingredient.Cream());
            this.name = "Decaf Coffee";
        }
    }

    public class CaffeLatte extends Drink {
        public CaffeLatte() {
            for(int i = 0; i<2; i++){
                drinkIngredient.add(new Ingredient.Espresso());
            }
            drinkIngredient.add(new Ingredient.SteamedMilk());
            this.name = "Caffee Latte";
        }
    }

    public class CaffeAmericano extends Drink {
        public CaffeAmericano() {
            for(int i = 0; i < 3; i++){
                drinkIngredient.add(new Ingredient.Espresso());
            }
            this.name = "Caffe Americano";
        }
    }

    public class CaffeMocha extends Drink {
        public CaffeMocha() {
            drinkIngredient.add(new Ingredient.Espresso());
            drinkIngredient.add(new Ingredient.Cocoa());
            drinkIngredient.add(new Ingredient.SteamedMilk());
            drinkIngredient.add(new Ingredient.WhippedCream());
            this.name = "Caffe Mocha";
        }
    }

    public class Cappuccino extends Drink {
        public Cappuccino() {
            for(int i = 0; i < 2; i++){
                drinkIngredient.add(new Ingredient.Espresso());
            }
            drinkIngredient.add(new Ingredient.SteamedMilk());
            drinkIngredient.add(new Ingredient.FoamedMilk());
            this.name = "Cappuccino";
        }
    }

    /**
     * Perhaps use this section to continuously add drinks? or perhaps a custom drink class?
     */

    public class CustomDrink extends Drink {
        public CustomDrink(String name, ArrayList<Ingredient> theIngredients){
            for(Ingredient unit : theIngredients){
                this.drinkIngredient.add(unit);
            }
            this.name = name;
        }
    }

}

/**
 * This abstract class will be the super class for the following ingredients
 * These classes contain an immutable price value that is inherent to the ingredient
 * These price values will be used to calculate the cost of the drinks
 */
abstract class Ingredient {
    public final double PRICE = 0;

    public Ingredient() {

    }

    public double returnPrice() {
        return PRICE;
    }

    static class Coffee extends Ingredient {
        public final double PRICE = 0.75;

        public Coffee() {

        }

        public double returnPrice() {
            return PRICE;
        }


    }

    static class DecafCoffee extends Ingredient {
        public final double PRICE = 0.75;

        public DecafCoffee() {

        }

        public double returnPrice() {
            return PRICE;
        }
    }

    static class Sugar extends Ingredient {
        public final double PRICE = 0.25;

        public Sugar() {

        }

        public double returnPrice() {
            return PRICE;
        }
    }

    static class Cream extends Ingredient {
        public final double PRICE = 0.25;

        public Cream() {

        }

        public double returnPrice() {
            return PRICE;
        }
    }

    static class SteamedMilk extends Ingredient {
        public final double PRICE = 0.35;

        public SteamedMilk() {

        }

        public double returnPrice() {
            return PRICE;
        }

    }

    static class FoamedMilk extends Ingredient {
        public final double PRICE = 0.35;

        public FoamedMilk() {
        }

        public double returnPrice() {
            return PRICE;
        }
    }

    static class Espresso extends Ingredient {
        public final double PRICE = 1.10;

        public Espresso() {
        }

        public double returnPrice() {
            return PRICE;
        }
    }

    static class Cocoa extends Ingredient {
        public final double PRICE = 0.90;

        public Cocoa() {
        }

        public double returnPrice() {
            return PRICE;
        }
    }

    static class WhippedCream extends Ingredient {
        public final double PRICE = 1.00;

        public WhippedCream() {
        }

        public double returnPrice() {
            return PRICE;
        }
    }
}