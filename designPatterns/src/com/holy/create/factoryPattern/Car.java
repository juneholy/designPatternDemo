package com.holy.create.factoryPattern;

/**
 * Created by houlin.jiang on 16-4-25.
 */
public class Car implements Factory{
    @Override
    public void create() {
        System.out.println("I am Car Product ! Create a car");
    }
}
