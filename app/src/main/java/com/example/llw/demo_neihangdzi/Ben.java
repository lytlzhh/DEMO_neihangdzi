package com.example.llw.demo_neihangdzi;

/**
 * Created by llw on 2016/8/2.
 */
public class Ben {
    int images = 0;
    String srt = null;


    public Ben(int images, String srt) {
        this.images = images;
        this.srt = srt;
    }


    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    public String getSrt() {
        return srt;
    }

    public void setSrt(String srt) {
        this.srt = srt;
    }
}
