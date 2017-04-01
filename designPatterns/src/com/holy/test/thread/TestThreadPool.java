package com.holy.test.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by holy on 2017/3/24.
 */
public class TestThreadPool {
    public static void main(String[] args) {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        cachedThreadPool = Executors.newSingleThreadExecutor();
        cachedThreadPool = Executors.newFixedThreadPool(10);
        cachedThreadPool = Executors.newScheduledThreadPool(2);
        cachedThreadPool.execute(new Runnable() {
            @Override
            public void run() {

            }
        });
    }
}
