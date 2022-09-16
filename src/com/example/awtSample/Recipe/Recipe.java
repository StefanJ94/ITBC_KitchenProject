package com.example.awtSample.Recipe;

import com.example.awtSample.Enums.RecipeLevel;
import com.example.awtSample.Ingredient.WeightedIngredient;
import com.example.awtSample.Interfaces.Priceable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Recipe implements Priceable {
    private static int count = 0;
    private int id;
    private final RecipeLevel recipeLevel;

    String recipeName;
    private double weightRecipe = 0;

    private List<WeightedIngredient> allIngredientsForRecipe = new ArrayList<>();


    public Recipe(String recipeName, RecipeLevel recipeLevel, List<WeightedIngredient> allIngredientsForRecipe) {
        this.recipeName = recipeName;
        this.id = count++;
        this.recipeLevel = recipeLevel;
        this.allIngredientsForRecipe = new ArrayList<>();
    }
    public Recipe(String recipeName, RecipeLevel recipeLevel) {
        this.recipeName = recipeName;
        this.recipeLevel = recipeLevel;
    }

    public int getId() {
        return id;
    }

    public RecipeLevel getRecipeLevel() {
        return recipeLevel;
    }

    public String getRecipeName() {
        return recipeName;
    }

    
    public void addIngredient(WeightedIngredient weightedIngredient) {
        allIngredientsForRecipe.add(weightedIngredient);
    }
    public void removeIngredient(WeightedIngredient weightedIngredient) {
        allIngredientsForRecipe.remove(weightedIngredient);
    }

    public Recipe getScaledRecipe(double percentage) {
        Recipe newRecipe = new Recipe(recipeName, recipeLevel);
        for (WeightedIngredient weightedIngredient : allIngredientsForRecipe) {
            WeightedIngredient newWI = new WeightedIngredient();
            newWI.setIngredientName(weightedIngredient.getIngredientName());
            newWI.setPricePerUnit(weightedIngredient.getPricePerUnit());
            newWI.setWeight(weightedIngredient.getWeight() * (percentage / 100));
            newRecipe.addIngredient(newWI);
        }
        return newRecipe;
    }

    public List<WeightedIngredient> getAllIngredientsForRecipe() {
        return allIngredientsForRecipe;
    }

    public double getWeightRecipe() {
        for (int i = 0; i < allIngredientsForRecipe.size(); i++) {
            weightRecipe += allIngredientsForRecipe.get(i).getWeight();
        }
        return weightRecipe;
    }

    public double getScaleRecipe50Weight() {
        double halfRecipe = 0;
        for (int i = 0; i < allIngredientsForRecipe.size(); i++) {
            halfRecipe += allIngredientsForRecipe.get(i).getWeight() / 2;
        }
        return halfRecipe;
    }

    public double getScaleRecipe33Weight() {
        double aThirdRecipe = 0;
        for (int i = 0; i < allIngredientsForRecipe.size(); i++) {
            aThirdRecipe += allIngredientsForRecipe.get(i).getWeight() / 3;
        }
        return aThirdRecipe;
    }

    @Override
    public double getPrice() {
        double suma = 0;
        for (int i = 0; i < allIngredientsForRecipe.size(); i++)
            suma += allIngredientsForRecipe.get(i).getPrice();
        return suma;
    }

    @Override
    public String toString() {
        return "Recipe: " + recipeName + " ingredients: " + allIngredientsForRecipe;
     }
}
