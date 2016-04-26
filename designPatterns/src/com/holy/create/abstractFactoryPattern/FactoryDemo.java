package com.holy.create.abstractFactoryPattern;

/**
 * Created by houlin.jiang on 16-4-25.
 */
public class FactoryDemo {
    public static void main(String[] args) {
        AbstractFactory carProduct = FactoryProducer.getFactory("Product");
        Product car = carProduct.getProduct("car");
        car.create();
    }
}
