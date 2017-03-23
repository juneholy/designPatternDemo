package com.holy.test;

import java.util.Random;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by houlin.jiang on 17-3-14.
 */
public class TestSynchronous {

    public static void main(String[] args) {

    }

    /**
     * 方法1
     * synchronized 修饰方法
     */
    public class Bank1 {

        public int accout = 0;

        public synchronized void save(int money) {
            accout += money;
        }

        public int getAccout() {
            return accout;
        }

    }

    /**
     * 方法2
     * synchronized 修饰代码块
     */
    public class Bank2 {
        public Integer accout = 0;

        public void save(int money) {
            synchronized (accout) {
                accout += money;
            }
        }

        public int getAccout() {
            return accout;
        }


    }

    /**
     * 方法3
     * volatile 修饰同步字段
     */
    public class Bank3 {
        public volatile Integer accout = 0;

        public void save(int money) {
            accout += money;
        }

        public int getAccout() {
            return accout;
        }
    }

    /**
     * 方法4
     * ReentrantLock
     */
    public class Bank4 {
        public Lock lock = new ReentrantLock();
        public Integer accout = 0;

        public void save(int money) {
            lock.lock();
            try {
                accout += money;
            } finally {
                lock.unlock();
            }
        }

        public int getAccout() {
            return accout;
        }
    }

    /**
     * 方法5
     * 使用局部变量ThreadLocal
     */
    public class Bank5 {
        public ThreadLocal<Integer> accout = new ThreadLocal<Integer>() {
            @Override
            protected Integer initialValue() {
                return 0;
            }
        };

        public void save(int money) {
            accout.set(accout.get() + money);

        }

        public int getAccout() {
            return accout.get();
        }
    }
    /**
     * 方法6
     * 使用阻塞队列
     */
    public class Bank6 {

        private LinkedBlockingDeque<Integer> queue = new LinkedBlockingDeque<>();
        private static final int size = 10;
        private int flag = 0;
        private class LinkBlockThread implements Runnable {

            @Override
            public void run() {
                int flagNew =flag ++;
                if (flagNew == 0) {
                    for(int i = 0 ;i < size;i++) {
                        int b = new Random().nextInt(255);
                        try {
                            queue.put(b);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                } else {
                    for (int i = 0 ; i < size/2;i++) {
                        try {
                            int n = queue.take();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
    /**
     * 方法6
     * 使用原子变量
     */
    public class Bank7 {
        public AtomicInteger accout = new AtomicInteger(100);

        public void save(int money) {
            accout.addAndGet(money);
        }

        public AtomicInteger getAccout() {
            return accout;
        }
    }
}
