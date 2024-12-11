package com.example;

import java.util.ArrayList;
import java.util.List;

public class FruitMain {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Apple(150, 52));
        fruits.add(new Banana(120, 89));
        fruits.add(new Orange(130, 47));
        fruits.add(new Strawberry(50, 32));
        fruits.add(new Grape(200, 69));

        double totalWeight = calculateTotalWeight(fruits);
        System.out.println("Total weight of all fruits: " + totalWeight + " grams");

        List<String> fruitsLess50 = getFruitsLess50(fruits);
        System.out.println("Fruits with calories less than 50:");
        for (String fruitName : fruitsLess50) {
            System.out.println(fruitName);
        }
    }

    public static int calculateTotalWeight(List<Fruit> fruits) {
        int totalWeight = 0;
        for (Fruit fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public static List<String> getFruitsLess50(List<Fruit> fruits) {
        List<String> fruitsLess50 = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruit.getTotalCalories() < 50) {
                fruitsLess50.add(fruit.getName());
            }
        }
        return fruitsLess50;
    }
}
