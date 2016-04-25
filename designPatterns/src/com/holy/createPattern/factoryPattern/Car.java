package com.holy.createPattern.factoryPattern;

/**
 * Created by houlin.jiang on 16-4-25.
 */
public class Car implements Factory{
    @Override
    public void create() {
        System.out.println("I am Car Product ! Create a car");
    }
}
