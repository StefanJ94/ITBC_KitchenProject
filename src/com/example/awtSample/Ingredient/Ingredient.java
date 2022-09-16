package com.example.awtSample.Ingredient;

import com.example.awtSample.Interfaces.Priceable;

public abstract class Ingredient implements Priceable {
    private static int count = 0;

    private final int id;
    String ingredientName;

    public Ingredient(String ingredientName) {
        this.ingredientName = ingredientName;
        this.id = count++;
    }

    public int getId() {
        return id;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "ingredientName='" + ingredientName + '\'' +
                '}';
    }
}
