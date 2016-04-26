package com.holy.structure.proxyPattern;

/**
 * Created by houlin.jiang on 16-4-26.
 */
public class RealFile implements File{
    public String fileName;

    public RealFile(String fileName) {
        this.fileName = fileName;
        loading(fileName);
    }

    private void loading(String fileName) {
        System.out.println("loading " + fileName  + "from disk");
    }

    @Override
    public void open() {
        System.out.println("open : " + fileName );
    }


}
