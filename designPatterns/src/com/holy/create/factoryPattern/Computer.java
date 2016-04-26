package com.holy.create.factoryPattern;

/**
 * Created by houlin.jiang on 16-4-25.
 */
public class Computer implements Factory{
    @Override
    public void create() {
        System.out.println("I am Computer Product ! Create an Computer");
    }
}
