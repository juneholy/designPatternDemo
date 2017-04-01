package com.holy.test.thread;

/**
 * Created by houlin.jiang on 17-3-3.
 */
public class TestYieldThread extends Thread {
    public static int shareVar = 0;

    public TestYieldThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            Thread.yield();
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                System.out.println("Interrupted");
//            }

        }
    }
}
