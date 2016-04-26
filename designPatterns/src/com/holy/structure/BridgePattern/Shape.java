package com.holy.structure.BridgePattern;

/**
 * Created by houlin.jiang on 16-4-26.
 */
public abstract class Shape {
    DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    abstract void draw();
}
