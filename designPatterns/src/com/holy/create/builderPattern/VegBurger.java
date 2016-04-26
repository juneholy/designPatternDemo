package com.holy.create.builderPattern;

/**
 * Created by houlin.jiang on 16-4-25.
 */
public class VegBurger extends Burger{
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
