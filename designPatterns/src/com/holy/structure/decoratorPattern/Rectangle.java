package com.holy.structure.decoratorPattern;

/**
 * Created by holy on 2017/3/31.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape : rectangle");
    }
}
