package com.holy.structure.BridgePattern;

import sun.security.provider.SHA;

/**
 * Created by houlin.jiang on 16-4-26.
 */
public class Circle extends Shape{
    private int x,y;

    public Circle(int x, int y,DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
    }

    @Override
    void draw() {
        drawAPI.drawCircle(x,y);
    }
}
