package com.holy.create.abstractFactoryPattern;

/**
 * Created by houlin.jiang on 16-4-25.
 */
public class Office implements Building {
    @Override
    public void build() {
        System.out.println("I am office building ! ");
    }
}
