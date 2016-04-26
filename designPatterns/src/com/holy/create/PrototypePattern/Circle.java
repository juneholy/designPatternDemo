package com.holy.create.PrototypePattern;

/**
 * Created by houlin.jiang on 16-4-26.
 */
public class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("draw Circle");
    }

    public Circle() {
        type = "Circle";
    }
}
