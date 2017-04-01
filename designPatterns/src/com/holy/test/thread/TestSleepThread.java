package com.holy.test.thread;

/**
 * Created by houlin.jiang on 17-3-3.
 */
public class TestSleepThread extends Thread{
    public static int shareVar = 0;

public TestSleepThread(String name) {
    super(name);
}
    public synchronized void run() {
            for(int i = 0;i<5;i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
                System.out.println();
                try{
                    Thread.sleep(100);
                }
                catch(InterruptedException e){
                    System.out.println("Interrupted");
                }
            }
    }
}
