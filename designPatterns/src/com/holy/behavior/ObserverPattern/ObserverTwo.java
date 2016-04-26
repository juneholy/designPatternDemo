package com.holy.behavior.ObserverPattern;

/**
 * Created by houlin.jiang on 16-4-26.
 */
public class ObserverTwo extends Observer{
    public ObserverTwo(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    void update() {
        System.out.println( "ObserverTwo String: "+ Integer.toBinaryString( subject.getState() ) );
    }
}
