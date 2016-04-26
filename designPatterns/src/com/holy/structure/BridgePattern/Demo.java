package com.holy.structure.BridgePattern;

/**
 * Created by houlin.jiang on 16-4-26.
 */
public class Demo {
    /**
     *
     * 作为桥接实现的 DrawAPI 接口和实现了 DrawAPI 接口的实体类 RedCircle、GreenCircle。Shape 是一个抽象类，将使用 DrawAPI 的对象。
     */

    public static void main(String[] args) {
        Shape greenCircle = new Circle(3,5,new GreenCircle());
        Shape redCircle = new Circle(6,7,new RedCircle());

        greenCircle.draw();
        redCircle.draw();
    }
}
