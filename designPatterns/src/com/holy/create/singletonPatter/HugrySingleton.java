package com.holy.create.singletonPatter;

/**
 * Created by houlin.jiang on 16-4-25.
 */
public class HugrySingleton {
    private static HugrySingleton mHugrySingleton = new HugrySingleton();

    public static HugrySingleton getInstance() {
        return mHugrySingleton;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
