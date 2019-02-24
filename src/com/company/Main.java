package com.company;

import java.io.PrintStream;
import java.util.ArrayList;
import java.lang.Math;

public class Main {
    static PrintStream out = new PrintStream(System.out);


    public static ArrayList<Integer> coffee = new ArrayList<Integer>();
    public static ArrayList<Integer> decafCoffee = new ArrayList<Integer>();
    public static ArrayList<Integer> sugar = new ArrayList<Integer>();
    public static ArrayList<Integer> cream = new ArrayList<Integer>();
    public static ArrayList<Integer> steamedMilk = new ArrayList<Integer>();
    public static ArrayList<Integer> foamedMilk = new ArrayList<Integer>();
    public static ArrayList<Integer> espresso = new ArrayList<Integer>();
    public static ArrayList<Integer> cocoa = new ArrayList<Integer>();
    public static ArrayList<Integer> whippedCream = new ArrayList<Integer>();

    /*
    TODO: I will have to implement some sort of FILE IO system for the ingredients
     */
    public static void main(String[] args) {


    }

    /**
     * This method will determine whether it is possible to construct a drink or not
     * @param theDrink the chosen beverage
     * @return whether the drink can be made or not
     */
    public static boolean canIMakeDrink(Drink theDrink) {

        int amountOfCoffee = 0, amountOfDecaf = 0, amountOfSugar = 0, amountOfCream = 0, amountOfSteamedMilk = 0, amountOfFoamedMilk = 0, amountOfEspresso = 0, amountOfCocoa = 0, amountOfWhippedCream = 0;

        for (Ingredient unit : theDrink.returnDrinkIngredient()) {

            if (unit instanceof Ingredient.Coffee) {
                amountOfCoffee++;
            }

            if (unit instanceof Ingredient.DecafCoffee) {
                amountOfDecaf++;
            }

            if (unit instanceof Ingredient.Sugar) {
                amountOfSugar++;
            }

            if (unit instanceof Ingredient.Cream) {
                amountOfCream++;

            }

            if (unit instanceof Ingredient.SteamedMilk) {
                amountOfSteamedMilk++;
            }

            if (unit instanceof Ingredient.FoamedMilk) {
                amountOfFoamedMilk++;
            }

            if (unit instanceof Ingredient.Espresso) {
                amountOfEspresso++;
            }

            if (unit instanceof Ingredient.Cocoa) {
                amountOfCocoa++;
            }

            if (unit instanceof Ingredient.WhippedCream) {
                amountOfWhippedCream++;
            }
        }


        if (amountOfCoffee <= coffee.size() && amountOfDecaf <= decafCoffee.size() && amountOfSugar <= sugar.size() && amountOfCream <= cream.size() && amountOfSteamedMilk <= steamedMilk.size() && amountOfFoamedMilk <= foamedMilk.size() && amountOfEspresso <= espresso.size() && amountOfCocoa <= cocoa.size() && amountOfWhippedCream <= whippedCream.size()) {
            return true;
        }


        return false;
    }

    /**
     * This method will restock all the ingredients
     */
    public static void restock() {
        while (coffee.size() < 10) {
            coffee.add(1);
        }

        while (decafCoffee.size() < 10) {
            decafCoffee.add(1);
        }

        while (sugar.size() < 10) {
            sugar.add(1);
        }

        while (cream.size() < 10) {
            cream.add(1);
        }

        while (steamedMilk.size() < 10) {
            steamedMilk.add(1);
        }

        while (foamedMilk.size() < 10) {
            foamedMilk.add(1);
        }

        while (espresso.size() < 10) {
            espresso.add(1);
        }
        while (cocoa.size() < 10) {
            cocoa.add(1);
        }
        while (whippedCream.size() < 10) {
            whippedCream.add(1);
        }

    }

    /**
     * this method removes elements from the arraylists based on the ingredients in a drink
     */
    public static void removeFromArrays(ArrayList<Ingredient> thelist) {
        for (Ingredient unit : thelist) {
            if (unit instanceof Ingredient.Coffee) {
                coffee.remove(coffee.size() - 1);
            }

            if (unit instanceof Ingredient.DecafCoffee) {
                decafCoffee.remove(decafCoffee.size() - 1);
            }

            if (unit instanceof Ingredient.Sugar) {
                sugar.remove(sugar.size() - 1);
            }

            if (unit instanceof Ingredient.Cream) {
                cream.remove(cream.size() - 1);

            }

            if (unit instanceof Ingredient.SteamedMilk) {
                steamedMilk.remove(steamedMilk.size() - 1);
            }

            if (unit instanceof Ingredient.FoamedMilk) {
                foamedMilk.remove(foamedMilk.size() - 1);
            }

            if (unit instanceof Ingredient.Espresso) {
                espresso.remove(espresso.size() - 1);
            }

            if (unit instanceof Ingredient.Cocoa) {
                cocoa.remove(cocoa.size() - 1);
            }

            if (unit instanceof Ingredient.WhippedCream) {
                whippedCream.remove(whippedCream.size() - 1);
            }
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
    public double calculatePrice() {
        double price = 0;
        if (drinkIngredient != null && !drinkIngredient.isEmpty()) {

            for (int i = 0; i < drinkIngredient.size(); i++) {
                price += drinkIngredient.get(i).returnPrice();
            }

        }
        /*
         *This portion of code is used to remove floating point errors
         */
        return Math.floor(price * 100) / 100;


    }

    public ArrayList<Ingredient> returnDrinkIngredient() {
        return drinkIngredient;
    }

    public String returnName() {
        return name;
    }

    public static class Coffee extends Drink {
        public Coffee() {
            for (int i = 0; i < 3; i++) {
                drinkIngredient.add(new Ingredient.Coffee());
            }
            drinkIngredient.add(new Ingredient.Sugar());
            drinkIngredient.add(new Ingredient.Cream());
            this.name = "Coffee";

        }
    }

    public static class DecafCoffee extends Drink {
        public DecafCoffee() {
            for (int i = 0; i < 3; i++) {
                drinkIngredient.add(new Ingredient.DecafCoffee());
            }
            drinkIngredient.add(new Ingredient.Sugar());
            drinkIngredient.add(new Ingredient.Cream());
            this.name = "Decaf Coffee";
        }
    }

    public static class CaffeLatte extends Drink {
        public CaffeLatte() {
            for (int i = 0; i < 2; i++) {
                drinkIngredient.add(new Ingredient.Espresso());
            }
            drinkIngredient.add(new Ingredient.SteamedMilk());
            this.name = "Caffe Latte";
        }
    }

    public static class CaffeAmericano extends Drink {
        public CaffeAmericano() {
            for (int i = 0; i < 3; i++) {
                drinkIngredient.add(new Ingredient.Espresso());
            }
            this.name = "Caffe Americano";
        }
    }

    public static class CaffeMocha extends Drink {
        public CaffeMocha() {
            drinkIngredient.add(new Ingredient.Espresso());
            drinkIngredient.add(new Ingredient.Cocoa());
            drinkIngredient.add(new Ingredient.SteamedMilk());
            drinkIngredient.add(new Ingredient.WhippedCream());
            this.name = "Caffe Mocha";
        }
    }

    public static class Cappuccino extends Drink {
        public Cappuccino() {
            for (int i = 0; i < 2; i++) {
                drinkIngredient.add(new Ingredient.Espresso());
            }
            drinkIngredient.add(new Ingredient.SteamedMilk());
            drinkIngredient.add(new Ingredient.FoamedMilk());
            this.name = "Cappuccino";
        }
    }

    /**
     * Perhaps use this section to continuously add drinks? or perhaps a custom drink class?
     * The issue is that I will then have to make a method that displays everything in alphabetical order
     */

    public static class CustomDrink extends Drink {
        public CustomDrink(String name, ArrayList<Ingredient> theIngredients) {
            for (Ingredient unit : theIngredients) {
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
