package com.holy.create.builderPattern;

/**
 * Created by houlin.jiang on 16-4-25.
 */
public class MeatBurger extends Burger{
    @Override
    public String name() {
        return "MeatBurger";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
