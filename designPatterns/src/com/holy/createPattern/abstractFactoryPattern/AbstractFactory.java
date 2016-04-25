package com.holy.createPattern.abstractFactoryPattern;

/**
 * Created by houlin.jiang on 16-4-25.
 */
public abstract class AbstractFactory {
    abstract Product getProduct(String want);
    abstract Building getBuilding(String want);
}
