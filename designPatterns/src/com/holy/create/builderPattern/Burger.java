package com.holy.create.builderPattern;

/**
 * Created by houlin.jiang on 16-4-25.
 */
public abstract class Burger implements Item{
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
