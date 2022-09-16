package com.example.awtSample;

import com.example.awtSample.Enums.RecipeLevel;
import com.example.awtSample.Fridge.Fridge;
import com.example.awtSample.Ingredient.WeightedIngredient;
import com.example.awtSample.Recipe.Recipe;

import java.util.ArrayList;
import java.util.List;

public abstract class Database {

    public static final List<WeightedIngredient> allIngredients = new ArrayList<>();
    public static final List<Recipe> allRecipes = new ArrayList<>();
    public static List<Recipe> allFavouriteRecipes = new ArrayList<>();
    public static Fridge lg = new Fridge();


    static {
        WeightedIngredient zacinC = new WeightedIngredient("ZačinC", 100, 2.5);
        WeightedIngredient so = new WeightedIngredient("So", 100, 1.5);
        WeightedIngredient secer = new WeightedIngredient("Šećer", 100, 0.88);
        WeightedIngredient biber = new WeightedIngredient("Biber", 100, 1.7);
        WeightedIngredient jaja = new WeightedIngredient("Jaja", 55, 0.5);
        WeightedIngredient ulje = new WeightedIngredient("Ulje", 1000, 0.22);
        WeightedIngredient meso = new WeightedIngredient("Meso", 1000, 0.77);
        WeightedIngredient luk = new WeightedIngredient("Luk", 1000, 0.150);
        WeightedIngredient paradajz = new WeightedIngredient("Paradajz", 1000, 0.3);
        WeightedIngredient pitaGiros = new WeightedIngredient("PitaGiros", 1000, 0.2);
        WeightedIngredient tzatziki = new WeightedIngredient("Tzatziki", 1000, 0.333);
        WeightedIngredient grckiZacin = new WeightedIngredient("Grcki zacin", 200, 1.3);
        WeightedIngredient kajmak = new WeightedIngredient("Kajmak", 200, 2);
        WeightedIngredient pavlakaZaKuvanje = new WeightedIngredient("Pavlaka za kuvanje", 500, 0.5);
        WeightedIngredient spagete = new WeightedIngredient("Špagete", 400, 0.150);
        WeightedIngredient parmezan = new WeightedIngredient("Parmezan", 100, 1.2);
        WeightedIngredient voda = new WeightedIngredient("Voda", 1000, 0);
        WeightedIngredient mleko = new WeightedIngredient("Mleko", 1000, 0.125);
        WeightedIngredient neskafa = new WeightedIngredient("Neskafa", 100, 2.4);
        WeightedIngredient grandkafa = new WeightedIngredient("Grand kafa", 200, 1.3);
        WeightedIngredient limun = new WeightedIngredient("Limun", 200, 1.2);

        Database.allIngredients.add(zacinC); Database.allIngredients.add(so); Database.allIngredients.add(secer); Database.allIngredients.add(biber);
        Database.allIngredients.add(jaja); Database.allIngredients.add(ulje); Database.allIngredients.add(meso); Database.allIngredients.add(luk);
        Database.allIngredients.add(paradajz); Database.allIngredients.add(pitaGiros); Database.allIngredients.add(tzatziki); Database.allIngredients.add(grckiZacin);
        Database.allIngredients.add(kajmak); Database.allIngredients.add(pavlakaZaKuvanje); Database.allIngredients.add(spagete); Database.allIngredients.add(parmezan);
        Database.allIngredients.add(voda); Database.allIngredients.add(mleko); Database.allIngredients.add(neskafa); Database.allIngredients.add(grandkafa); Database.allIngredients.add(limun);

        var jajaNaOko = new Recipe("JajaNaOko", RecipeLevel.BEGINNER);
        jajaNaOko.addIngredient(jaja); jajaNaOko.addIngredient(so); jajaNaOko.addIngredient(ulje);


        var kajgana = new Recipe("Kajgana",RecipeLevel.BEGINNER);
        kajgana.addIngredient(jaja); kajgana.addIngredient(so); kajgana.addIngredient(ulje);


        var giros = new Recipe("Giros",RecipeLevel.MEDIUM);
        giros.addIngredient(so); giros.addIngredient(biber); giros.addIngredient(ulje); giros.addIngredient(meso);
        giros.addIngredient(luk); giros.addIngredient(paradajz); giros.addIngredient(pitaGiros); giros.addIngredient(tzatziki);



        var suvlaki = new Recipe("Suvlaki",RecipeLevel.HARD);
        suvlaki.addIngredient(meso); suvlaki.addIngredient(ulje); suvlaki.addIngredient(so);
        suvlaki.addIngredient(biber); suvlaki.addIngredient(grckiZacin);


        var pljeskavica = new Recipe("Pljeskavica",RecipeLevel.HARD);
        pljeskavica.addIngredient(so); pljeskavica.addIngredient(biber); pljeskavica.addIngredient(ulje);
        pljeskavica.addIngredient(meso); pljeskavica.addIngredient(zacinC); pljeskavica.addIngredient(luk);


        var cevapiNaKajmaku = new Recipe("Ćevapi na kajmaku",RecipeLevel.PRO);
        cevapiNaKajmaku.addIngredient(so); cevapiNaKajmaku.addIngredient(biber); cevapiNaKajmaku.addIngredient(ulje);
        cevapiNaKajmaku.addIngredient(kajmak); cevapiNaKajmaku.addIngredient(luk);


        var pasta = new Recipe("Pasta",RecipeLevel.MEDIUM);
        pasta.addIngredient(pavlakaZaKuvanje); pasta.addIngredient(meso); pasta.addIngredient(ulje);
        pasta.addIngredient(parmezan); pasta.addIngredient(spagete); pasta.addIngredient(voda);


        var nesKafa = new Recipe("NesKafa",RecipeLevel.BEGINNER);
        nesKafa.addIngredient(voda); nesKafa.addIngredient(mleko); nesKafa.addIngredient(neskafa);


        var domacaKafa = new Recipe("Domaća kafa",RecipeLevel.EASY);
        domacaKafa.addIngredient(voda); domacaKafa.addIngredient(grandkafa);


        var limunada = new Recipe("Limunada",RecipeLevel.EASY);
        limunada.addIngredient(voda); limunada.addIngredient(limun); limunada.addIngredient(secer);

        Database.allRecipes.add(jajaNaOko); Database.allRecipes.add(kajgana); Database.allRecipes.add(giros); Database.allRecipes.add(suvlaki);
        Database.allRecipes.add(pljeskavica); Database.allRecipes.add(cevapiNaKajmaku); Database.allRecipes.add(pasta); Database.allRecipes.add(nesKafa);
        Database.allRecipes.add(domacaKafa); Database.allRecipes.add(limunada);
    }
}
