package com.holy.structure.BridgePattern;

/**
 * Created by houlin.jiang on 16-4-26.
 */
public class GreenCircle implements DrawAPI{

    @Override
    public void drawCircle(int x, int y) {
        System.out.println("draw circle color : green " + "x = [" + x + "], y = [" + y + "]");
    }
}
