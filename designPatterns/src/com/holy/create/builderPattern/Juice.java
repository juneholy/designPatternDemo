package com.holy.create.builderPattern;

/**
 * Created by houlin.jiang on 16-4-25.
 */
public class Juice extends ColdDrink{
    @Override
    public String name() {
        return "Juice";
    }

    @Override
    public float price() {
        return 5.0f;
    }
}
