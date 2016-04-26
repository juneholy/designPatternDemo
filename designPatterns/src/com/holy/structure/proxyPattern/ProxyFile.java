package com.holy.structure.proxyPattern;

import com.sun.org.apache.regexp.internal.recompile;

/**
 * Created by houlin.jiang on 16-4-26.
 */
public class ProxyFile implements File{
    private String fileName ;
    private RealFile realFile;

    public ProxyFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void open() {
        if (realFile == null) {
            realFile = new RealFile(fileName);
        }
        realFile.open();
    }
}
