package com.holy.test;

/**
 * Created by houlin.jiang on 17-3-3.
 */
public class TestSuspendThread extends Thread{
    public static int shareVar = 0;

public TestSuspendThread(String name) {
    super(name);
}
    public synchronized void run() {
        if(shareVar==0){
            for(int i=0; i<5; i++){
                shareVar++;
                if(shareVar==5){
                    this.suspend();
                }
            }
        }
        else{
            System.out.print(Thread.currentThread().getName());
            System.out.println(" shareVar = " + shareVar);
            this.resume();
        }
    }
}
