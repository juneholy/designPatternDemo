package com.holy.create.builderPattern;

/**
 * Created by houlin.jiang on 16-4-26.
 */
public class Demo {
    public static void main(String[] args) {

        /**
         * 将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。

         适用性：

         当创建复杂对象的算法应该独立于该对象的组成部分以及它们的装配方式时。

         当构造过程必须允许被构造的对象有不同的表示时。
         */
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " +vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.getCost());

    }
}
