package com.holy.create.singletonPatter;

/**
 * Created by houlin.jiang on 16-4-25.
 */
public class LazySingleton {
    private static LazySingleton mLazySingleton;
    public static LazySingleton getInstance() {
        if (mLazySingleton == null) {
            mLazySingleton = new LazySingleton();
        }
        return mLazySingleton;
    }

}
