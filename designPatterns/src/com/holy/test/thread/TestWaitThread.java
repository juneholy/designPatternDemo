package com.holy.test.thread;

/**
 * Created by houlin.jiang on 17-3-3.
 */
public class TestWaitThread extends Thread {
    public static int shareVar = 0;

    public TestWaitThread(String name) {
        super(name);
    }

    public synchronized void run() {
        if (shareVar == 0) {
            for (int i = 0; i < 10; i++) {
                shareVar++;
                if (shareVar == 5) {
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                    }
                }
            }
        }
        if (shareVar != 0) {
            System.out.print(Thread.currentThread().getName());
            System.out.println(" shareVar = " + shareVar);
            this.notify();
        }
    }
}