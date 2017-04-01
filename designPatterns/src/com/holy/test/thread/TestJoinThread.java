package com.holy.test.thread;

/**
 * Created by houlin.jiang on 17-3-3.
 */
public class TestJoinThread {
    public static int shareVar = 0;

    public static void main(String[] args) {
        TestSleepThread t1 = new TestSleepThread("t1");
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
        }
        t1.start();
    }
}
