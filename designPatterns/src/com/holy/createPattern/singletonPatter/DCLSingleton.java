package com.holy.createPattern.singletonPatter;

/**
 * Created by houlin.jiang on 16-4-25.
 */
public class DCLSingleton {
    /**
     * double-checked locking
     */

    private volatile static DCLSingleton mSingleton;
    private DCLSingleton (){}
    public static DCLSingleton getSingleton() {
        if (mSingleton == null) {
            synchronized (DCLSingleton.class) {
                if (mSingleton == null) {
                    mSingleton = new DCLSingleton();
                }
            }
        }
        return mSingleton;
    }
}
