package com.example.awtSample.Fridge;

import com.example.awtSample.Ingredient.WeightedIngredient;
import com.example.awtSample.Recipe.Recipe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Fridge {

    public Fridge() {
        this.fridgeIngredient = fridgeIngredient;
    }

    HashMap<WeightedIngredient, Integer> fridgeIngredient = new HashMap<>();

    public void addOrComplementIngredient(WeightedIngredient weightedIngredient) {
        if (fridgeIngredient.containsKey(weightedIngredient))
            fridgeIngredient.put(weightedIngredient,fridgeIngredient.get(weightedIngredient) + 1);
        else fridgeIngredient.put(weightedIngredient,1);
    }
    public void removeIngredient(WeightedIngredient weightedIngredient) {
        fridgeIngredient.remove(weightedIngredient.getId(),weightedIngredient);
    }

    public boolean madeableMeal(Recipe recipe) {
        for (WeightedIngredient w : recipe.getAllIngredientsForRecipe()) {
            if (!fridgeIngredient.containsKey(w)) {
                return false;
            }
        }
        return true;
    }
    public void makeMeal(Recipe recipe) {
        if (!madeableMeal(recipe)){
            System.out.println("Not madeable meal!");
        }
        for (WeightedIngredient w : recipe.getAllIngredientsForRecipe()) {
            if (fridgeIngredient.get(w) == 1) {
                fridgeIngredient.remove(w);
            }
            else {
                fridgeIngredient.put(w,fridgeIngredient.get(w) - 1);
            }
        }
    }

    public void setFridgeIngredient(HashMap<WeightedIngredient, Integer> fridgeIngredient) {
        this.fridgeIngredient = fridgeIngredient;
    }

    public Map<WeightedIngredient,Integer> getAllFridgeIngredients() {
        return fridgeIngredient;
    }


}
