package com.holy.structure.adapterPattern;

/**
 * Created by houlin.jiang on 16-5-11.
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String type) {
        if (type.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer = new VlcPlayer();
        } else if (type.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String type, String fileName) {
        if (advancedMusicPlayer == null) {
            System.out.println("can not deal " + type + " file !!!!");
        } else {
            if (type.equalsIgnoreCase("vlc")) {
                advancedMusicPlayer.playVlc(fileName);
            } else if (type.equalsIgnoreCase("mp4")) {
                advancedMusicPlayer.playMp4(fileName);
            }
        }
    }
}
