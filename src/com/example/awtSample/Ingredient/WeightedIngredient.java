package com.example.awtSample.Ingredient;

public class WeightedIngredient extends Ingredient{

    private double weight;
    private double pricePerUnit;


    public WeightedIngredient(String ingredientName, double weight, double pricePerUnit) {
        super(ingredientName);
        this.weight = weight;
        this.pricePerUnit = pricePerUnit;
    }
    public WeightedIngredient(String ingredientName) {
        super(ingredientName);
    }
    public WeightedIngredient(String ingridientName,double weight) {
        super(ingridientName);
        this.weight = weight;
    }

    public WeightedIngredient() {
        super(null);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCertainWeight(double weight) {
        return weight;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    @Override
    public double getPrice() {
        return this.weight * this.pricePerUnit;
    }
}
