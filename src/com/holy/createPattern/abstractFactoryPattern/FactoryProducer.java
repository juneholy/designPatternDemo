package com.holy.createPattern.abstractFactoryPattern;

/**
 * Created by houlin.jiang on 16-4-25.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("building")){
            return new RealBuilding();
        } else if(choice.equalsIgnoreCase("Product")){
            return new RealProduct();
        }
        return null;
    }
}
