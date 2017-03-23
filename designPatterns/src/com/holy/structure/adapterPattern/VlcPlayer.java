package com.holy.structure.adapterPattern;

/**
 * Created by houlin.jiang on 16-5-11.
 */
public class VlcPlayer implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        System.out.println("vlc player :" + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //do nothing
    }
}
