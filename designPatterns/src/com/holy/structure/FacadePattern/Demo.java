package com.holy.structure.FacadePattern;

/**
 * Created by houlin.jiang on 16-4-26.
 */
public class Demo {
    public static void main(String[] args){
        ShapeMaker maker = new ShapeMaker();
        maker.drawCircle();
        maker.drawRectangle();
        maker.drawSquare();
    }
}
