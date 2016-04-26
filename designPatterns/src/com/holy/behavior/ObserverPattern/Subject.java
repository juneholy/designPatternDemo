package com.holy.behavior.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by houlin.jiang on 16-4-26.
 */
public class Subject {
    private int state;
    public List<Observer> observers = new ArrayList<Observer>();

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObserver();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObserver(){
        for(Observer observer : observers) {
            observer.update();
        }
    }

}
