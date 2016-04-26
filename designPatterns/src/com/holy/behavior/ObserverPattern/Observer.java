package com.holy.behavior.ObserverPattern;

/**
 * Created by houlin.jiang on 16-4-26.
 */
public abstract class Observer {
    protected Subject subject;
    abstract void update();
}
