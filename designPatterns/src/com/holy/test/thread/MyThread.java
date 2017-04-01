package com.holy.test.thread;

/**
 * Created by holy on 2017/3/24.
 */
public class MyThread extends Thread{
    @Override
    public synchronized void start() {
        super.start();
    }

    @Override
    public void run() {
        super.run();
    }

    @Override
    public void interrupt() {
        super.interrupt();
    }
}
