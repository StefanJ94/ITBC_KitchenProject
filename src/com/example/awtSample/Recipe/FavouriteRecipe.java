package com.example.awtSample.Recipe;

import java.util.ArrayList;
import java.util.List;

public class FavouriteRecipe {
    public FavouriteRecipe() {
        this.favouriteRecipes = favouriteRecipes;
    }

    List<Recipe> favouriteRecipes = new ArrayList<>();


    public void addFavouriteRecipes(Recipe recipe) {
        this.favouriteRecipes.add(recipe);
    }

    public void removeFavouriteRecipes(Recipe recipe) {
        this.favouriteRecipes.remove(recipe);
    }
    public String lookRecipes() {
        return "Favourite recipes: " + favouriteRecipes;
            }

    public Recipe getFavouriteRecipes(int num) {
        return favouriteRecipes.get(num);
    }

    public String lookRecipes(double price) {
        for (int i = 0; i < favouriteRecipes.size(); i++) {
            if (price >= favouriteRecipes.get(i).getPrice()) {
                return "FavouriteRecipe{" +
                        "favouriteRecipes=" + favouriteRecipes +
                        '}';
            }
        }
        return "Nemate budzet!";
    }

    @Override
    public String toString() {
        return "FavouriteRecipe{" +
                "favouriteRecipes=" + favouriteRecipes +
                '}';
    }
}
