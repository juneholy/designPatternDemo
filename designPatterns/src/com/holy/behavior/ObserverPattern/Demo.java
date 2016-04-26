package com.holy.behavior.ObserverPattern;

/**
 * Created by houlin.jiang on 16-4-26.
 */
public class Demo {
    public static void main(String[] args){
        Subject subject = new Subject();
        new ObserverOne(subject);
        new ObserverTwo(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
