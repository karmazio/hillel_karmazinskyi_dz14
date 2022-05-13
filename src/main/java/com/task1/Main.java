package com.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        run();
        System.out.println("Thank you! Number of drinks: " + Drink.count);


    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);

        DrinksMachine drinksMachine = null;
        int total = 0;
        boolean stop = false;
        while (!stop) {
            while (!stop) {
                String str;
                System.out.println("Select your drinks or type \"stop\" to finish");
                str = scanner.next().toUpperCase();
                try {
                    drinksMachine = DrinksMachine.valueOf(str);

                    break;
                } catch (IllegalArgumentException e) {
                    stop = str.equals("STOP");
                }
            }
            if (stop) {
                break;
            }


            switch (drinksMachine) {
                case COFFEE:
                    System.out.println(makeDrink(drinksMachine));
                    new Drink();
                    total += Drinks.coffeeCost;
                    System.out.println("Total cost: " + total);
                    break;
                case TEA:
                    System.out.println(makeDrink(drinksMachine));
                    new Drink();
                    total += Drinks.teaCost;
                    System.out.println("Total cost: " + total);
                    break;
                case LEMONADE:
                    System.out.println(makeDrink(drinksMachine));
                    new Drink();
                    total += Drinks.lemonadeCost;
                    System.out.println("Total cost: " + total);
                    break;
                case MOJITO:
                    System.out.println(makeDrink(drinksMachine));
                    new Drink();
                    total += Drinks.mojitoCost;
                    System.out.println("Total cost: " + total);
                    break;
                case WATER:
                    System.out.println(makeDrink(drinksMachine));
                    new Drink();
                    total += Drinks.waterCost;
                    System.out.println("Total cost: " + total);
                    break;
                case COKE:
                    System.out.println(makeDrink(drinksMachine));
                    new Drink();
                    total += Drinks.cokeCost;
                    System.out.println("Total cost: " + total);
                    break;

            }

        }
    }

    public static String makeDrink(DrinksMachine drinksMachine) {
        return "Please, take your " + drinksMachine.getName();
    }
}
