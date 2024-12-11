package com.example;

public abstract class Fruit {
    private final String name;
    private final int weight; // in grams
    private final int caloriesPer100g; // in kcal per 100 grams

    public Fruit(String name, int weight, int caloriesPer100g) {
        this.name = name;
        this.weight = weight;
        this.caloriesPer100g = caloriesPer100g;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public double getTotalCalories() {
        return (weight / 100) * caloriesPer100g;
    }
}
