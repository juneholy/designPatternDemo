package com.holy.behavior.ObserverPattern;

/**
 * Created by houlin.jiang on 16-4-26.
 */
public class ObserverOne extends Observer{
    public ObserverOne(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    void update() {
        System.out.println( "ObserverOne String: "+ Integer.toBinaryString( subject.getState() ) );
    }
}
