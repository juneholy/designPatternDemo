package com.holy.createPattern.factoryPattern;

/**
 * Created by houlin.jiang on 16-4-25.
 */
public class FactoryDemo {
    public static void main(String[] args) {
        RealFactory factory = new RealFactory();

        Factory carFactory = factory.getFactory("car");
        carFactory.create();

        Factory computerFactory = factory.getFactory("computer");
        computerFactory.create();
    }
}
