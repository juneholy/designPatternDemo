package com.holy.structure.adapterPattern;

/**
 * Created by houlin.jiang on 16-5-11.
 */
public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        //do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("play mp4 " + fileName);
    }
}
