package com.holy.create.abstractFactoryPattern;

/**
 * Created by houlin.jiang on 16-4-25.
 */
public class RealProduct extends AbstractFactory{

    @Override
    Product getProduct(String want) {
        if (want == null || "".equals(want)) {
            return null;
        }

        if (want.equals("car")) {
            return new Car();
        } else if (want.equals("computer")) {
            return new Computer();
        } else {
            return null;
        }
    }

    @Override
    Building getBuilding(String want) {
        return null;
    }
}
