package com.holy.create.PrototypePattern;

/**
 * Created by houlin.jiang on 16-4-26.
 */
public class Rectangle extends Shape{
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("draw rectangle");
    }
}
