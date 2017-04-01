package com.holy.structure.decoratorPattern;

/**
 * Created by holy on 2017/3/31.
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectange = new RedShapeDecorator(new Rectangle());
        circle.draw();
        redCircle.draw();
        redRectange.draw();
    }

}
