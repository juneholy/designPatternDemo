package com.holy.create.builderPattern;

/**
 * Created by houlin.jiang on 16-4-26.
 */
public class MealBuilder {
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Juice());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new MeatBurger());
        meal.addItem(new Coffee());
        return meal;
    }
}
