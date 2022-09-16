package com.example.awtSample;

import com.example.awtSample.Fridge.Fridge;
import com.example.awtSample.Ingredient.WeightedIngredient;
import com.example.awtSample.Recipe.FavouriteRecipe;
import com.example.awtSample.Recipe.Recipe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Fridge lg = new Fridge();
        var favouriteRecipes = new FavouriteRecipe();
        favouriteRecipes.addFavouriteRecipes(Database.allRecipes.get(2));
        favouriteRecipes.addFavouriteRecipes(Database.allRecipes.get(3));
        favouriteRecipes.addFavouriteRecipes(Database.allRecipes.get(4));

        boolean isFlage = true;

        while (isFlage) {
            System.out.println("Welcome to the Kitchen. Chose some option between 0 and 13 (0 for EXIT): ");
            System.out.println("1. For adding ingredients to the fridge. \n"
                             + "2. For removing ingredients from the fridge. \n"
                             + "3. Madeable meals from the fridge. \n"
                             + "4. Madeable scaled meals. \n"
                             + "5. Making meals. \n"
                             + "6. Madeable meals with x amount of money. \n"
                             + "7. Meals with specified RecipeLevel \n"
                             + "8. Madeable meals with x amount of money and with specified RecipeLevel \n"
                             + "9. Sort recipes by RecipeLevel \n"
                             + "10. Sort recipes by getPrice() \n"
                             + "11. Look favourite recipes \n"
                             + "12. Add favourite recipes \n"
                             + "13. Remove favourite recipes \n"
                             + "14. Look favourite recipes to a certain price."
            );

            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();

            switch (num) {
                case 0 : isFlage = false;
                    System.out.println("EXIT KITCHEN.");
                break;
                case 1: addToFridge();
                break;
                case 2: removeFromFridge();
                break;
                case 3: madeableMeals();
                break;
                case 4: //NOT DONE
                    break;
        //        case 5: makeMeal();  NOT WORKING
        //            break;
                case 6: //NOT DONE
                    break;
                case 7: //NOT DONE
                    break;
                case 8: //NOT DONE
                    break;
                case 9: sortingByLevel();
                break;
                case 10: sortingByPrice();
                break;
                case 11: favouriteRecipes.lookRecipes();
                break;
                case 12: System.out.println("Add favourite recipe with id: ");
                    favouriteRecipes.addFavouriteRecipes(favouriteRecipes.getFavouriteRecipes(scanner.nextInt()));
                    scanner.nextLine();
                    break;
                case 13:
                    System.out.println("Remove favourite recipe with id: ");
                    favouriteRecipes.removeFavouriteRecipes(favouriteRecipes.getFavouriteRecipes(scanner.nextInt()));
                    scanner.nextLine();
                    break;
                case 14: //NOT DONE
                    break;
            }
        }

    }
    public static void addToFridge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chose id of ingredient which you want to add.");
        int id = scanner.nextInt();
        for (WeightedIngredient weightedIngredient: Database.allIngredients) {
            if (weightedIngredient.getId() == id) {
                Database.lg.addOrComplementIngredient(weightedIngredient);
                break;
            }
        }
    }
    public static void removeFromFridge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chose id of ingredient which you want to remove.");
        int id = scanner.nextInt();
        for (WeightedIngredient weightedIngredient: Database.allIngredients) {
            if (weightedIngredient.getId() == id) {
                Database.lg.removeIngredient(weightedIngredient);
                break;
            }
        }
    }
    public static void madeableMeals() {
        for (Recipe recipe: Database.allRecipes) {
            if (Database.lg.madeableMeal(recipe)) {
                System.out.println("Madeable meals: " + recipe);
            }
        }
    }
    public static void makeMeal(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chose meal id!");
        int id = scanner.nextInt();
        var recipe = Database.allRecipes.get(id);
        Database.lg.makeMeal(recipe);
        System.out.println("You just made " + recipe);
    }
    public static void sortingByLevel() {
        Database.allRecipes.sort((recipe1, recipe2) -> recipe1.getRecipeLevel().compareTo(recipe2.getRecipeLevel()));
        for (Recipe recipe:Database.allRecipes) {
            System.out.println(recipe.getRecipeName() + " is level: " + recipe.getRecipeLevel() + ".");
        }
    }
    public static void sortingByPrice() {
        Database.allRecipes.sort((recipe1,recipe2) -> (int) (recipe1.getPrice() - recipe2.getPrice()));
        for (Recipe recipe : Database.allRecipes) {
            System.out.println(recipe.getRecipeName() + " price is: " + recipe.getPrice() + ".");
        }
    }

}
