package com.holy.behavior.CommandPattern;

/**
 * Created by houlin.jiang on 16-4-26.
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}