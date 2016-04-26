package com.holy.create.abstractFactoryPattern;

/**
 * Created by houlin.jiang on 16-4-25.
 */
public class RealBuilding extends AbstractFactory{

    @Override
    Product getProduct(String want) {
        return null;
    }

    @Override
    Building getBuilding(String want) {
        if (want == null || "".equals(want)) {
            return null;
        }

        if (want.equals("office")) {
            return new Office();
        } else if (want.equals("dormitory")) {
            return new Dormitory();
        } else {
            return null;
        }
    }
}
