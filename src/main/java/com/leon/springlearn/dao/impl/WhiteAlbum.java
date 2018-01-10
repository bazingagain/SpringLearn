package com.leon.springlearn.dao.impl;

import com.leon.springlearn.dao.CompactDisc;

/**
 * Created on 10/01/2018.
 *
 * @author Xiaolei-Peng
 */
public class WhiteAlbum implements CompactDisc {
    private String title = " witeAlbum";
    private String artist = "The Betles";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
