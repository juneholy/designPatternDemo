package com.holy.create.abstractFactoryPattern;

/**
 * Created by houlin.jiang on 16-4-25.
 */
public class Computer implements Product {
    @Override
    public void create() {
        System.out.println("I am Computer Product ! Create an Computer");
    }
}
