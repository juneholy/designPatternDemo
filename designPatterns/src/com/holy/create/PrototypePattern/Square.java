package com.holy.create.PrototypePattern;

/**
 * Created by houlin.jiang on 16-4-26.
 */
public class Square extends Shape{
    @Override
    void draw() {
        System.out.println("draw square");
    }

    public Square() {
        type = "Square";
    }
}
