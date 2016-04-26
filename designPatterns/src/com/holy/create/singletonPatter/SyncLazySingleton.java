package com.holy.create.singletonPatter;

/**
 * Created by houlin.jiang on 16-4-25.
 */
public class SyncLazySingleton {
    private static LazySingleton mLazySingleton;

    //同步锁 线程安全
    public static synchronized LazySingleton getInstance() {
        if (mLazySingleton == null) {
            mLazySingleton = new LazySingleton();
        }
        return mLazySingleton;
    }
}
