package com.holy.create.factoryPattern;

/**
 * Created by houlin.jiang on 16-4-25.
 */
public class RealFactory {
    public  Factory getFactory (String want) {
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
}
