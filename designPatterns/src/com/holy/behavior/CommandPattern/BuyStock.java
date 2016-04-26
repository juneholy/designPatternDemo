package com.holy.behavior.CommandPattern;

/**
 * Created by houlin.jiang on 16-4-26.
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}