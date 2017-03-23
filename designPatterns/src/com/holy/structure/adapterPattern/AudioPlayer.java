package com.holy.structure.adapterPattern;

/**
 * Created by houlin.jiang on 16-5-11.
 */
public class AudioPlayer implements MediaPlayer{

    MediaAdapter mediaAdapter;
    @Override
    public void play(String type, String fileName) {
        if(type.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: "+ fileName);
        }
        //mediaAdapter 提供了播放其他文件格式的支持
        else if(type.equalsIgnoreCase("vlc")
                || type.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(type);
            mediaAdapter.play(type, fileName);
        }
        else{
            System.out.println("Invalid media. "+
                    type + " format not supported");
        }
    }
}
