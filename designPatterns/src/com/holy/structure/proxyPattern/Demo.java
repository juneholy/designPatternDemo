package com.holy.structure.proxyPattern;

/**
 * Created by houlin.jiang on 16-4-26.
 */
public class Demo {
    public static void main(String[] args) {
        File file = new ProxyFile("平凡的世界");
        file.open();
    }
}
