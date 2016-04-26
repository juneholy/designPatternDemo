package com.holy.create.builderPattern;

/**
 * Created by houlin.jiang on 16-4-25.
 */
public class Coffee extends ColdDrink{
    @Override
    public String name() {
        return "Coffee";
    }

    @Override
    public float price() {
        return 10.0f;
    }
}
